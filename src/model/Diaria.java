package model;

import java.io.Serializable;
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
   
}
