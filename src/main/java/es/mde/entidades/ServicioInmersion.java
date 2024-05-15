package es.mde.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("inmersion")
public class ServicioInmersion extends Servicio {
   private String tipoAlojamiento;

public String getTipoAlojamiento() {
	return tipoAlojamiento;
}

public void setTipoAlojamiento(String tipoAlojamiento) {
	this.tipoAlojamiento = tipoAlojamiento;
}

public ServicioInmersion() {
	super();
}
}