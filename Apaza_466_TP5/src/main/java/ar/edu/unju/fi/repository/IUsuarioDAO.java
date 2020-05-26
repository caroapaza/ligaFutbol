package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Usuario;

public interface IUsuarioDAO {
	
	public void guardar();
	public Usuario mostrar();
	public void eliminar();
	public Usuario modificar();

}
