package model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity

public class Quarto implements Serializable {

	private static final long serialVersionUID = 7751896682654260291L;
	
	@Id
	@GeneratedValue(generator = "genquarto")
	@SequenceGenerator(name="genquarto", sequenceName="quarto_codigo_seq")
	private int codigo;
	private String numero;
	
	@Enumerated(EnumType.STRING)
	private TipoDeQuarto tipo;
	
	@OneToMany(mappedBy="quarto")
	private Collection<Diaria> diarias;

	public Quarto() {
		super();
	}   
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}   
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public TipoDeQuarto getTipo() {
		return tipo;
	}
	public void setTipo(TipoDeQuarto tipo) {
		this.tipo = tipo;
	}
	
	public Collection<Diaria> getDiarias() {
		return diarias;
	}
	public void setDiarias(Collection<Diaria> diarias) {
		this.diarias = diarias;
	}
   
}
