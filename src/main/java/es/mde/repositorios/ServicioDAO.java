package es.mde.repositorios;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import es.mde.entidades.Servicio;

@RepositoryRestResource(path = "servicios", itemResourceRel = "servicio", collectionResourceRel = "servicios")
public interface ServicioDAO extends JpaRepository<Servicio, Long> {
	@RestResource(path = "por-descripcion")
	List<Servicio> findByDescripcionIgnoreCaseContaining(String txt);

	List<Servicio> findByFechaInicioAfter(LocalDate fecha);
}
