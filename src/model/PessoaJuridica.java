package model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import model.Pessoa;

@Entity
@DiscriminatorValue("PJ")
public class PessoaJuridica extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = -3715068730546222850L;
	
	private String razaoSocial;
	private String cnpj;
	private String inscricaoEstadual;
	private String inscricaoMunicipal;

	public PessoaJuridica() {
		super();
	}   
	public String getRazaoSocial() {
		return this.razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}   
	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}   
	public String getInscricaoEstadual() {
		return this.inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}   
	public String getInscricaoMunicipal() {
		return this.inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
   
}
