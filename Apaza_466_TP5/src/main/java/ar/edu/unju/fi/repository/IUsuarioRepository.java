package ar.edu.unju.fi.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import ar.edu.unju.fi.model.Usuario;



public interface IUsuarioRepository extends CrudRepository<Usuario,Long>{	
	
	public Optional<Usuario> findByDni(Long dni);	
}
