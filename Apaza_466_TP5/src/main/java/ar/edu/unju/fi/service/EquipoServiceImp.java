package ar.edu.unju.fi.service;


import java.util.List;
import java.util.Optional;

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

	@Override
	public Optional<Equipo> obtenerUnEquipo(Long id) {
		Optional<Equipo> equipo = equipoDaoImp.findById(id);
		return equipo;
	}

	@Override
	public void eliminarEquipo(Long id) {
		equipoDaoImp.deleteById(id);
		
	}

	@Override
	public List<Equipo> obtenerEquiposCiudad(String ciudad) {
		List<Equipo> equipos = equipoDaoImp.findByEstadioCiudad(ciudad);
		return equipos;
	}

	@Override
	public List<Equipo> obtenerEquiposCiudadCapacidad(String ciudad, int capacidad) {
		List<Equipo> equipos = equipoDaoImp.findByEstadioCiudadAndEstadioCapacidadLessThanEqual(ciudad, capacidad);
		return equipos;
	}

	@Override
	public List<Equipo> obtenerTodos() {
		List<Equipo> equipos = equipoDaoImp.findAll();
		return equipos;
	}











	

}
