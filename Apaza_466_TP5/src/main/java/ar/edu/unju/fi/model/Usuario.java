package ar.edu.unju.fi.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name= "usuarios")
public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ID")
	private Long id;
	
	private String nombre;
	
	private String apellido;
	
	@Column(name = "FECHA_NACIMIENTO")
	private LocalDate fechaNacimiento;
	
	private String direccion;
	
	private long dni;
	
	@Column(name = "FECHA_ALTA")
	private LocalDate fechaAlta;
	
	private String tipo; //SOCIO, ADMIN. CONSULTOR
	
	private String pasword;
	
	@OneToMany(mappedBy ="socio", cascade = CascadeType.ALL)
	private List<Cuota> cuotas = new ArrayList<Cuota>();
	
	public Usuario() {
		
	}

	public Usuario(String nombre, String apellido, LocalDate fechaNacimiento, String direccion, long dni,
			LocalDate fechaAlta, String tipo, String pasword) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.dni = dni;
		this.fechaAlta = fechaAlta;
		this.tipo = tipo;
		this.pasword = pasword;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	
	

	
	/**
	 * @return the cuotas
	 */
	public List<Cuota> getCuotas() {
		return cuotas;
	}

	/**
	 * @param cuotas the cuotas to set
	 */
	public void setCuotas(List<Cuota> cuotas) {
		this.cuotas = cuotas;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + ", dni=" + dni + ", fechaAlta=" + fechaAlta + ", tipo="
				+ tipo + ", pasword=" + pasword + "]";
	}
	
	
}
