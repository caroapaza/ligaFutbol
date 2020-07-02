package ar.edu.unju.fi.repository;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ar.edu.unju.fi.model.Equipo;

public interface IEquipoDAO extends JpaRepository<Equipo,Long>{
	
	@Query("from Equipo e order by e.nombre desc")
	public List<Equipo> obtenerEquipos();
	
	public List<Equipo> findByEstadioCiudad(String ciudad);
	
	public List<Equipo> findByEstadioCiudadAndEstadioCapacidadLessThanEqual(String ciudad, int capacidad);
	
	//fecha de fundacion entre 2 fechas
	public List<Equipo> findByEstadioFechaFundacionBetween(LocalDate date1, LocalDate date2);

	// ordenados por capacidad ascendente
	public List<Equipo> findAllByOrderByEstadioCapacidadAsc();


	// recuperar un equipo por su nombre
	public Optional<Equipo> findByNombre(String nombreEquipo);
}
