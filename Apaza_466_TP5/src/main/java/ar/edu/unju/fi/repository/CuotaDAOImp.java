package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Apaza466Tp5Application;
import ar.edu.unju.fi.model.Cuota;

@Repository
public class CuotaDAOImp implements ICuotaDAO {
	
	//@Autowired
	//private Cuota cuota;
	
	public static Logger LOG = LoggerFactory.getLogger(Apaza466Tp5Application.class);

	@Override
	public void guardar() {
		// guardar un registro en Cuota
		//LOG.info("Se guardó un registro de Cuota: "+ cuota.getId() );
	}

	@Override
	public Cuota mostrar() {
		// mostrar un objeto cuota
		//LOG.info(cuota.toString());
		return null;
	}

	@Override
	public void eliminar() {
		// eliminar un registro de cuota
		//LOG.info("Se eliminó el registro de cuota: "+cuota.getId());
	}

	@Override
	public Cuota modificar() {
		// modificar los datos de una cuota
		//LOG.info("Se modificaron los datos de cuota: "+cuota.toString());
		return null;
	}

	
}
