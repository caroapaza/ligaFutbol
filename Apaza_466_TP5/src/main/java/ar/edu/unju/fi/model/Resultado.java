package ar.edu.unju.fi.model;

import java.io.Serializable;
import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "resultados")
public class Resultado implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	private LocalDate fecha;
	
	@Autowired
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EQUIPO1_ID")
	private Equipo equipo1;
	
	@Autowired
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EQUIPO2_ID")
	private Equipo equipo2;
	
	@Column(name = "GOLES_EQUIPO_1")
	private int golesEquipo1;
	
	@Column(name = "GOLES_EQUIPO_2")
	private int golesEquipo2;
	
	@Column(name = "EQUIPO_LOCAL")
	private boolean isEquipo1Local;
	
	public Resultado() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Resultado(LocalDate fecha, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2,
			boolean isEquipo1Local) {
		super();
		this.fecha = fecha;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
		this.isEquipo1Local = isEquipo1Local;
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
	 * @return the equipo1
	 */
	public Equipo getEquipo1() {
		return equipo1;
	}

	/**
	 * @param equipo1 the equipo1 to set
	 */
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	/**
	 * @return the equipo2
	 */
	public Equipo getEquipo2() {
		return equipo2;
	}

	/**
	 * @param equipo2 the equipo2 to set
	 */
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	/**
	 * @return the golesEquipo1
	 */
	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	/**
	 * @param golesEquipo1 the golesEquipo1 to set
	 */
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	/**
	 * @return the golesEquipo2
	 */
	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	/**
	 * @param golesEquipo2 the golesEquipo2 to set
	 */
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}

	/**
	 * @return the isEquipo1Local
	 */
	public boolean isEquipo1Local() {
		return isEquipo1Local;
	}

	/**
	 * @param isEquipo1Local the isEquipo1Local to set
	 */
	public void setEquipo1Local(boolean isEquipo1Local) {
		this.isEquipo1Local = isEquipo1Local;
	}



	@Override
	public String toString() {
		return "Resultado [id=" + id + ", fecha=" + fecha + ", equipo1=" + equipo1 + ", equipo2=" + equipo2
				+ ", golesEquipo1=" + golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + ", isEquipo1Local="
				+ isEquipo1Local + "]";
	}
	
	

}
