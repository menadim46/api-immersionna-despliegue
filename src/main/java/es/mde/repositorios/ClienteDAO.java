package es.mde.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.entidades.Cliente;

@RepositoryRestResource(path = "clientes", itemResourceRel = "cliente", collectionResourceRel = "clientes")
public interface ClienteDAO extends JpaRepository<Cliente, Long>, ClienteDAOCustom {

	List<Cliente> findAllById(Long id);

}
