package model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public abstract class Pessoa implements Serializable {

	private static final long serialVersionUID = -3481513276713672904L;

	@Id
	@GeneratedValue(generator = "genpessoa")
	@SequenceGenerator(sequenceName = "pessoa_codigo_seq", name = "genpessoa")
	private int codigo;
	
	private String nome;
	
	private String telefone;
	
	@Column(nullable = false, unique = true)
	private String email;

	@Embedded
	private Endereco endereco;
	
	@OneToMany(mappedBy = "cliente")
	private Collection<Reserva> reservas;

	public Pessoa() {
		super();
	}
	
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Collection<Reserva> getReservas() {
		return reservas;
	}
	
	public void setReservas(Collection<Reserva> reservas) {
		this.reservas = reservas;
	}
}
