package ar.edu.unju.fi.repository;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ar.edu.unju.fi.model.Equipo;

public interface IEquipoDAO extends JpaRepository<Equipo,Long>{
	
	@Query("from Equipo e order by e.nombre desc")
	public List<Equipo> obtenerEquipos();
	
	public List<Equipo> findByEstadioCiudad(String ciudad);
	
	public List<Equipo> findByEstadioCiudadAndEstadioCapacidadLessThanEqual(String ciudad, int capacidad);
	
	
}
