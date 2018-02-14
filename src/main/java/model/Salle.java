package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Salle {
	
	@Id
	private int id;
	@Column(name="libelle")
	private String libelle;
	
	
	public int getId() {
		return id;
	}
	
	public Salle()
	{
		
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	

}
