package ar.edu.unju.fi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.IUsuarioServiceImp;

@Controller
public class UsuarioController {

	@Autowired
	private IUsuarioServiceImp usuarioService;
	
	@Autowired
	private Usuario unUsuario;

	@GetMapping("/formulario")
	public String cargarFormulario(Model model) {
		model.addAttribute("usuarioDelForm", unUsuario);
		model.addAttribute("listaUsuarios", usuarioService.listarTodos());
		model.addAttribute("formTab", "active");
		return "usuarioForm";
	}

	@PostMapping("/formulario")
	public String crearUsuario(@Valid @ModelAttribute("usuarioDelForm") Usuario usuario, BindingResult result,
			ModelMap model) {
		// agregado Valid (en el modelo tambien) y BindingResult
		if (result.hasErrors()) {
			// si da error el objeto recibido se vuelve a enviar a la vista
			model.addAttribute("usarioDelForm", usuario);
			model.addAttribute("formTab", "active");
		} else {
			try {
				usuarioService.crear(usuario);
				model.addAttribute("usuarioDelForm", unUsuario);
				model.addAttribute("listTab", "active");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// pasar las excepciones al html
				model.addAttribute("formUsuarioErrorMessage", e.getMessage());
				model.addAttribute("usuarioDelForm", usuario);
				model.addAttribute("listaUsuarios", usuarioService.listarTodos());
				model.addAttribute("formTab", "active");
			}
		}
		model.addAttribute("listaUsuarios", usuarioService.listarTodos());
		return "usuarioForm";
	}

	@GetMapping("/cancelar")
	public String cancelarEditarUsuario(ModelMap model) {
		return "redirect:/formulario";
	}
	
	@GetMapping("/eliminarUsuario/{id}")
	public String eliminarUsuario(Model model, @PathVariable(name="id") Long id) {
		try {
			usuarioService.eliminar(id);;
		}
		catch(Exception e){
			model.addAttribute("listErrorMessage",e.getMessage());
		}			
		return cargarFormulario(model);
	}
	
	
	@GetMapping("/editarUsuario/{id}")
	public String obtenerFormularioEditarUsuario(Model model, @PathVariable(name="id") Long id) throws Exception {
		Usuario usuarioEncontrado = usuarioService.encontrarUsuario(id);
		model.addAttribute("usuarioDelForm", usuarioEncontrado);
		model.addAttribute("listaUsuarios", usuarioService.listarTodos());		
		model.addAttribute("formTab", "active");
		model.addAttribute("editMode", "true");
		return "usuarioForm";
	}
	
	@PostMapping("/editarUsuario")
	public String postEditarUsuario(@Valid @ModelAttribute("usuarioDelForm") Usuario usuario, BindingResult result, ModelMap model) {
		if(result.hasErrors()) {
			//si da error el objeto recibido se vuelve a enviar a la vista
			model.addAttribute("usuarioDelForm", usuario);			
			model.addAttribute("formTab", "active");
			model.addAttribute("editMode", "true");
		} else {
			try {
				usuarioService.modificar(usuario);
				model.addAttribute("usuarioDelForm", unUsuario);			
				model.addAttribute("listTab", "active");
				model.addAttribute("editMode", "false");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// pasar las excepciones al html
				model.addAttribute("formUsuarioErrorMessage",e.getMessage());
				model.addAttribute("userForm", usuario);			
				model.addAttribute("formTab", "active");
				model.addAttribute("listaUsuarios", usuarioService.listarTodos());				
				model.addAttribute("editMode", "true");
			}
		}
		model.addAttribute("listaUsuarios", usuarioService.listarTodos());		
		return "usuarioForm";
	}
}
