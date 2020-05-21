/**
 * 
 */
package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;



/**
 * Representa una noticia difundida por la 
 * Liga de Futbol
 * @author Ariel
 *
 */
@Component
public class Noticia {
	/**
	 * Fecha de la noticia
	 */
	private LocalDate fecha;
	/**
	 * Titulo de la noticia
	 */
	private String titulo;
	/**
	 * Resumen de la noticia
	 */
	private String resumen;
	
	//----------CONSTRUCTORES--------
	
	/**
	 * Constructor por defecto
	 */
	public Noticia() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param fecha Valor que se asignará a la fecha de la noticia
	 * @param titulo Valor que se asignará al título de la noticia
	 * @param resumen Valor que se asignará al resumen de la noticia
	 */
	public Noticia(LocalDate fecha, String titulo, String resumen) {
		this.fecha = fecha;
		this.titulo = titulo;
		this.resumen = resumen;
	}
	
	

	@Override
	public String toString() {
		return "Noticia [fecha=" + fecha + ", titulo=" + titulo + ", resumen=" + resumen + "]";
	}

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	
	

}
