package es.mde.entidades;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
@DiscriminatorValue("empleado")
public class Empleado extends Usuario{
private String zona;
@OneToMany(cascade = CascadeType.ALL, targetEntity = Reserva.class, mappedBy = "empleado")
private Collection<Reserva> reservas = new ArrayList<>();
public Collection<Reserva> getReservas() {
	return reservas;
}

public void setReservas(Collection<Reserva> reservas) {
	this.reservas = reservas;
}
//
public void addReserva(Reserva reserva) {
	this.getReservas().add(reserva);
	reserva.setEmpleado(this);
}
public String getZona() {
	return zona;
}

public void setZona(String zona) {
	this.zona = zona;
}

public Empleado() {
}
}
