package es.mde.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.entidades.Empleado;

@RepositoryRestResource(path = "empleados", itemResourceRel = "empleado", collectionResourceRel = "empleados")
public interface EmpleadoDAO extends JpaRepository<Empleado, Long> {

}
