package ar.edu.unju.fi.repository;

import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Usuario;

@Repository("usuarioDAOImpMySQL")
public class UsuarioDAOImpMySQL implements IUsuarioDAO{

	@Override
	public void guardar() {
		System.out.println("Se ha guardado el usuario en la base de datos MySQL");
		
	}

	@Override
	public Usuario mostrar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario modificar() {
		// TODO Auto-generated method stub
		return null;
	}

}
