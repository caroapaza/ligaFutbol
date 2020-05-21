package ar.edu.unju.fi.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Equipo {
	private String nombre;
	private Estadio estadio;
	
	//-------CONSTRUCTORES-------
	/**
	 * @param estadio
	 */
	@Autowired
	public Equipo(Estadio estadio) {
		this.estadio = estadio;
	}
	
	
	
	public Equipo() {
		// TODO Auto-generated constructor stub
	}
	
	
	





	//------METODOS ACCESORES-------
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}


	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	
	
}
