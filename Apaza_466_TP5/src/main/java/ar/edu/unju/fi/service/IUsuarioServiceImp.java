package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.IUsuarioRepository;

@Service
public class IUsuarioServiceImp implements IUsuarioService{
	
	@Autowired
	IUsuarioRepository iUsuario;

	@Override
	public void crear(Usuario unUsuario) {
		// TODO Auto-generated method stub	
		String pw = unUsuario.getPassword();
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
		unUsuario.setPassword(bCryptPasswordEncoder.encode(pw));
		iUsuario.save(unUsuario);
	}
		
	@Override
	public Iterable<Usuario> listarTodos() {
		// TODO Auto-generated method stub
		return iUsuario.findAll();
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		iUsuario.deleteById(id);	
	}

	@Override
	public Usuario modificar(Usuario unUsuario) throws Exception {
		// TODO Auto-generated method stub
		Usuario usuarioGuardar = encontrarUsuario(unUsuario.getId());
		mapearUsuario(unUsuario, usuarioGuardar);		
		return iUsuario.save(usuarioGuardar);
	}
	
	public void mapearUsuario(Usuario desde, Usuario hacia) {
		hacia.setNombre(desde.getNombre());
		hacia.setApellido(desde.getApellido());
		hacia.setDireccion(desde.getDireccion());
		hacia.setFechaAlta(desde.getFechaAlta());
		hacia.setDni(desde.getDni());
		hacia.setFechaNac(desde.getFechaNac());
	}

	@Override
	public Usuario encontrarUsuario(Long id) throws Exception {
		// TODO Auto-generated method stub
		return iUsuario.findById(id).orElseThrow(()-> new Exception("El Usuario no Existe"));
	}
}
