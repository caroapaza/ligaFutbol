package ar.edu.unju.fi.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name ="equipos")
public class Equipo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "NOMBRE", length = 150, nullable = true)
	private String nombre;
	
	@Autowired
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "ESTADIO_ID")
	private Estadio estadio;
	
	
	
	//-------CONSTRUCTORES-------
	/**
	 * @param estadio
	 */
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



	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + ", estadio=" + estadio + "]";
	}
	
	
	
}