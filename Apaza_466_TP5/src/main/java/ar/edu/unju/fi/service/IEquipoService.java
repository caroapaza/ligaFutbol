package ar.edu.unju.fi.service;

import java.util.List;
import java.util.Optional;

import ar.edu.unju.fi.model.Equipo;

public interface IEquipoService {
	
	public void guardarEquipo(Equipo equipo);
	
	public List<Equipo> obtenerEquipos();
	
	public Optional<Equipo> obtenerUnEquipo(Long id);
	
	public void eliminarEquipo(Long id);
	
	public List<Equipo> obtenerEquiposCiudad(String ciudad);
	
	public List<Equipo> obtenerEquiposCiudadCapacidad(String ciudad, int capacidad);
	
	public List<Equipo> obtenerTodos();
	
	
}
