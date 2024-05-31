package es.mde.repositorios;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import es.mde.entidades.ServicioInmersion;

@RepositoryRestResource(path = "serviciosInmersion", itemResourceRel = "servicioInmersion", collectionResourceRel = "serviciosInmersion")
public interface ServicioInmersionDAO extends JpaRepository<ServicioInmersion, Long> {
	@RestResource(path = "por-tipo-alojamiento")
	List<ServicioInmersion> findByTipoAlojamientoIgnoreCaseContaining(String txt);
}
