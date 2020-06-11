package ar.edu.unju.fi.controller;



import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.service.IEquipoService;


@Controller
@RequestMapping
public class EquipoController {
	
	@Autowired
	IEquipoService equipoService;
	
	@Autowired
	private Equipo equipo;
	
	@RequestMapping("/equipos")
	public String getEstadioForm(Model model) {
		//List<Equipo> equipos = equipoService.obtenerEquipos();
		//List<Equipo> equipos = equipoService.obtenerEquiposCiudad("Buenos Aires");
		//List<Equipo> equipos = equipoService.obtenerEquiposCiudadCapacidad("Buenos Aires",50000);
		List<Equipo> equipos = equipoService.obtenerTodos();
		model.addAttribute("equipos", equipos);
		return "equipos-1";
	}

	
	@GetMapping("/nuevoEquipo")
	public String agregar(Model model) {
		model.addAttribute("equipo", equipo);
		return "equipo-form";
	}
	
	@PostMapping("/save")
	public String guardar(@Valid Equipo equipo, Model model) {
		equipoService.guardarEquipo(equipo);
		return "redirect:/equipos";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable Long id, Model model) {
		Optional<Equipo> equipo = equipoService.obtenerUnEquipo(id);
		model.addAttribute("equipo", equipo);
		return "equipo-form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Long id, Model model) {
		equipoService.eliminarEquipo(id);
		return "redirect:/equipos";
	}

}
