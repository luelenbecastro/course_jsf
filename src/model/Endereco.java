package model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco implements Serializable{

	private static final long serialVersionUID = 8250637772356880384L;
	
	private String lograduro;
	private String numero;
	private String complemento;
	private String cep;
	private String bairro;
	private String cidade;
	private String uf;

	public String getLograduro() {
		return lograduro;
	}
	public void setLograduro(String lograduro) {
		this.lograduro = lograduro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
}
