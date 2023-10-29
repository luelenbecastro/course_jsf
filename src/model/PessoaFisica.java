package model;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;
import model.Pessoa;

@Entity
@DiscriminatorValue("PF")
public class PessoaFisica extends Pessoa implements Serializable {

	private static final long serialVersionUID = -3558501488357777952L;
	
	private String cpf;
	private String rg;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

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
   
}
