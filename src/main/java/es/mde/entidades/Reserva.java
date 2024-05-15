package es.mde.entidades;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "RESERVAS")
public class Reserva {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombreApellidosCliente;
  private LocalDate fechaReserva;
  private String tareaAsignada;
  private String Username;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "SERVICIO")
  private Servicio servicio;

  public Servicio getServicio() {
    return servicio;
  }

  public void setServicio(Servicio servicio) {
    this.servicio = servicio;
  }

  public String getNombreApellidosCliente() {
    return nombreApellidosCliente;
  }

  public void setNombreApellidosCliente(String nombreApellidosCliente) {
    this.nombreApellidosCliente = nombreApellidosCliente;
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
    this.fechaReserva = fechaReserva;
  }

  public String getTareaAsignada() {
    return tareaAsignada;
  }

  public void setTareaAsignada(String tareaAsignada) {
    this.tareaAsignada = tareaAsignada;
  }

  public String getUsername() {
    return Username;
  }

  public void setUsername(String username) {
    Username = username;
  }

  public Reserva() {}
}
