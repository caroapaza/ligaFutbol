package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.service.INoticiaService;

@Controller
public class NoticiaController {

	@Autowired
	private INoticiaService noticiaServiceImp;
	
	
	@RequestMapping("/noticias")
	public String getNoticiasform(Model model) {
		model.addAttribute("noticias",noticiaServiceImp.listar());
		return "noticias";
	}	
		
	
}
