package ar.edu.unju.fi.repository;
import java.util.List;
import ar.edu.unju.fi.model.Noticia;

public interface INoticiaDAO {

	public List<Noticia> listar();
	public void guardar(Noticia noticia); 
}
