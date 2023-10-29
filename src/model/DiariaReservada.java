package model;

import java.io.Serializable;
import javax.persistence.*;
import model.Diaria;

@Entity
@DiscriminatorValue("reservada")
public class DiariaReservada extends Diaria implements Serializable {

	private static final long serialVersionUID = 3630046206643509920L;

	@ManyToOne
	@JoinColumn(name = "cod_reserva")
	private Reserva reserva;
	
	public DiariaReservada() {
		super();
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
}
