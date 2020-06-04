package ar.edu.unju.fi.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Noticia;

@Repository
public class NoticaDAOImp implements INoticiaDAO{

	@Override
	public List<Noticia> listar() {
		// TODO Auto-generated method stub
		
		//retorno excepcionalmente un arrayList
		List<Noticia> noticiasTemp = new ArrayList<Noticia>();
		noticiasTemp.add(new Noticia(LocalDate.now(), "Se Suspendio el Torneo", "La AFA desidio suspender el futbol en todo el pais, debido a la la cuarentena obligatoria."));
		noticiasTemp.add(new Noticia(LocalDate.now(), "Empiezan los entrenamiento", "Algunas provincias empezaron los los permisos a los clubes para que puedan entrenar."));
		noticiasTemp.add(new Noticia(LocalDate.now(), "Se Suspendio el Torneo", "La AFA desidio suspender el futbol en todo el pais, debido a la la cuarentena obligatoria."));
		noticiasTemp.add(new Noticia(LocalDate.now(), "Empiezan los entrenamiento", "Algunas provincias empezaron los los permisos a los clubes para que puedan entrenar."));
		noticiasTemp.add(new Noticia(LocalDate.now(), "Se Suspendio el Torneo", "La AFA desidio suspender el futbol en todo el pais, debido a la la cuarentena obligatoria."));
		noticiasTemp.add(new Noticia(LocalDate.now(), "Empiezan los entrenamiento", "Algunas provincias empezaron los los permisos a los clubes para que puedan entrenar."));
		
		return noticiasTemp;
	}

	@Override
	public void guardar(Noticia noticia) {
		// TODO Auto-generated method stub
		
	}

}
