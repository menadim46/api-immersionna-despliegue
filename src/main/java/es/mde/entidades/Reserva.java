package es.mde.entidades;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "RESERVAS")
public class Reserva {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate fechaReserva;
	private String tareaAsignada;
	private String usuario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SERVICIO")
	private Servicio servicio;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLEADO")
	private Empleado empleado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLIENTE")
	private Cliente cliente;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(LocalDate fechaReserva) {
		 if (this.servicio != null) {
	            LocalDate fechaInicio = servicio.getFechaInicio();
	            LocalDate fechaFin = servicio.getFechaFin();
	            if (fechaReserva.isBefore(fechaInicio) || fechaReserva.isAfter(fechaFin)) {
	                throw new IllegalArgumentException("La fecha de reserva debe estar entre la fecha de inicio y la fecha de fin del servicio");
	            }
	        }
	        this.fechaReserva = fechaReserva;	}

	public String getTareaAsignada() {
		return tareaAsignada;
	}

	public void setTareaAsignada(String tareaAsignada) {
		this.tareaAsignada = tareaAsignada;
	}

	public Reserva() {
	}
}
