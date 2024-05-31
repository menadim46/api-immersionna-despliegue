package es.mde.repositorios;

import java.time.LocalDate;
import java.util.List;

import es.mde.entidades.Cliente;
import es.mde.entidades.Servicio;

public interface ClienteDAOCustom {

	List<Servicio> getServiciosClienteDesdeFecha(Long id, LocalDate fecha);
}
