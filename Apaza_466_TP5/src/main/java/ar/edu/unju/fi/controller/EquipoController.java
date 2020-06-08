package ar.edu.unju.fi.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
		List<Equipo> equipos = equipoService.obtenerEquipos();
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

}
