package model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public class Diaria implements Serializable {

	private static final long serialVersionUID = -3951954329331076546L;
	
	@Id
	@GeneratedValue
	private int codigo;
	private Date data;
	
	@ManyToMany
	@JoinTable(name = "hopedagem", 
				joinColumns = @JoinColumn(referencedColumnName = "cod_diaria"), 
				inverseJoinColumns = @JoinColumn(name = "cod_pessoa"))
	private Collection<PessoaFisica> hospedes;
	
	@ManyToOne
	@JoinColumn(name = "cod_quarto")
	private Quarto quarto;

	public Diaria() {
		super();
	}   
	    
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}   
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Collection<PessoaFisica> getHospedes() {
		return hospedes;
	}

	public void setHospedes(Collection<PessoaFisica> hospedes) {
		this.hospedes = hospedes;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
   
}
