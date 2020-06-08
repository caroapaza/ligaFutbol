package ar.edu.unju.fi.service;



import java.util.List;

import ar.edu.unju.fi.model.Equipo;

public interface IEquipoService {
	
	public void guardarEquipo(Equipo equipo);
	
	public List<Equipo> obtenerEquipos();
}
