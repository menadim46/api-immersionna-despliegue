package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.entidades.Cliente;

@RepositoryRestResource(path="clientes",itemResourceRel="cliente",collectionResourceRel="clientes")
public interface ClienteDAO extends JpaRepository<Cliente, Long>{

}
