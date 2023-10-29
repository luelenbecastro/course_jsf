package model;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("avulsa")
public class DiariaAvulsa extends Diaria implements Serializable {

	private static final long serialVersionUID = 522415675685708205L;
	
	private double valor;
	
	@ManyToOne
	@JoinColumn(name="cod_pessoa")
	private Pessoa cliente;

	public DiariaAvulsa() {
		super();
	}   
	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
   
}
