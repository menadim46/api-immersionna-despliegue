package es.mde.repositorios;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import es.mde.entidades.ServicioInmersion;
import es.mde.entidades.ServicioIntercambio;

@RepositoryRestResource(path="serciciosIntercambio",itemResourceRel="servicioIntercambio",collectionResourceRel="serviciosIntercambio")
public interface ServicioIntercambioDAO extends JpaRepository<ServicioIntercambio,Long>{

  @RestResource(path = "por-nivel-estudios")
  List<ServicioInmersion> findByNivelEstudiosIgnoreCaseContaining(String txt);
}
