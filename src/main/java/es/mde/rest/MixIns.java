package es.mde.rest;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;

public class MixIns {

	public static interface Reservas {
   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMMM-yyyy")
   public LocalDate getFechaReserva();
   
	
	   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMMM-yyyy")
	   public void setFechaReserva();
	  


}
}