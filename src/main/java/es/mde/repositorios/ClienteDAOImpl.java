package es.mde.repositorios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import es.mde.entidades.Servicio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

//metodo personalizado
@Transactional(readOnly = true)
public class ClienteDAOImpl implements ClienteDAOCustom {

	@Autowired
	ClienteDAO clienteDAO;
	@Autowired
	ServicioDAO servicioDAO;
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<Servicio> getServiciosClienteDesdeFecha(Long id, LocalDate fecha) {
		List<Servicio> serviciosCliente = new ArrayList<>();
		serviciosCliente = clienteDAO.findById(id).get().getReservas().stream().map(reserva -> reserva.getServicio())
				.collect(Collectors.toList());
		List<Servicio> serviciosExistentesDesdeFecha = servicioDAO.findByStartDateAfter(fecha);
		return serviciosCliente.stream().filter(serviciosExistentesDesdeFecha::contains).collect(Collectors.toList());
	}
}
