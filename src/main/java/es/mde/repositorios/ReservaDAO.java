package es.mde.repositorios;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import es.mde.entidades.Reserva;

@RepositoryRestResource(path = "reservas", itemResourceRel = "reserva", collectionResourceRel = "reservas")
public interface ReservaDAO extends JpaRepository<Reserva, Long> {
	
	@RestResource(path = "reservas-por-tarea")
	List<Reserva> findByTareaAsignada(String tarea);

	@RestResource(path = "reservas-por-fecha")
	List<Reserva> findByFechaReserva(LocalDate fecha);
}
