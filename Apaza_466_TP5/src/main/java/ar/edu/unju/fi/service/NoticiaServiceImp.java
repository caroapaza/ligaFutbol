package ar.edu.unju.fi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.repository.INoticiaDAO;


@Service
public class NoticiaServiceImp implements INoticiaService{

	@Autowired
	private INoticiaDAO noticiaDAOImp;
	
	@Override
	public List<Noticia> listar() {
		// TODO Auto-generated method stub
		return noticiaDAOImp.listar();
	}

}
