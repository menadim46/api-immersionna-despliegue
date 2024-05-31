package es.mde.rest;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import es.mde.entidades.Servicio;
import es.mde.repositorios.ClienteDAO;
import es.mde.repositorios.ServicioDAO;

@RepositoryRestController
public class ClienteController {

	private ServicioDAO servicioDAO;
	private ClienteDAO clienteDAO;

	public ClienteController(ClienteDAO clienteDAO) {

		this.clienteDAO = clienteDAO;
	}

	@GetMapping("/clientes/{id}/servicios-contratados")
	@ResponseBody
	public CollectionModel<PersistentEntityResource> getServiciosClienteDesdeFecha(@PathVariable Long id,
			@RequestParam("fecha") LocalDate fecha, PersistentEntityResourceAssembler assembler) {
		System.err.println("prueba");
		List<Servicio> servicios = clienteDAO.getServiciosClienteDesdeFecha(id, fecha);
		return assembler.toCollectionModel(servicios);
	}

}
