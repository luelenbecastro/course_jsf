package model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("PF")
public class PessoaFisica extends Pessoa implements Serializable {

	private static final long serialVersionUID = -3558501488357777952L;
	
	private String cpf;
	private String rg;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@ManyToMany(mappedBy = "hospedes")
	private Collection<Diaria> diarias;

	@Enumerated
	private Sexo sexo;
	
	public PessoaFisica() {
		super();
	}   
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}   
	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}   
	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Collection<Diaria> getDiarias() {
		return diarias;
	}
	public void setDiarias(Collection<Diaria> diarias) {
		this.diarias = diarias;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
}
