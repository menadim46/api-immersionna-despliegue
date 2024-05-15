package es.mde.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("intercambio")
public class ServicioIntercambio extends Servicio {
private String nivelEstudios;

public String getNivelEstudios() {
	return nivelEstudios;
}

public void setNivelEstudios(String nivelEstudios) {
	this.nivelEstudios = nivelEstudios;
}

public ServicioIntercambio() {
	super();
}

}