package ar.edu.unju.fi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.repository.IEquipoDAO;
@Service
public class EquipoServiceImp implements IEquipoService {
	
	@Autowired
	IEquipoDAO equipoDaoImp;

	@Override
	public void guardarEquipo(Equipo equipo) {
		equipoDaoImp.save(equipo);
		
	}

	@Override
	public List<Equipo> obtenerEquipos() {
		
		return equipoDaoImp.obtenerEquipos();
	}

	

}
