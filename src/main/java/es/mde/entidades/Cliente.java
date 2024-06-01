package es.mde.entidades;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
@DiscriminatorValue("cliente")
public class Cliente extends Usuario {
private String numeroPasaporte;


@OneToMany(cascade = CascadeType.ALL, targetEntity = Reserva.class, mappedBy = "cliente")
private Collection<Reserva> reservas = new ArrayList<>();


public Collection<Reserva> getReservas() {
	return reservas;
}

public void setReservas(Collection<Reserva> reservas) {
	this.reservas = reservas;
}

public String getNumeroPasaporte() {
	return numeroPasaporte;
}

public void setNumeroPasaporte(String numeroPasaporte) {
	this.numeroPasaporte = numeroPasaporte;
}

public void addReserva(Reserva reserva) {
	this.getReservas().add(reserva);
	reserva.setCliente(this);
}



public Cliente() {
}
}
