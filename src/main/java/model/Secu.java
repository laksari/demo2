package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Secu {

	@Id
	private int id;
	@Column(name="numero")
	private String numero;
	
	public Secu()
	{
		
	}
	
	public Secu(int id, String numero) {
		this.id = id;
		this.numero = numero;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	

}
