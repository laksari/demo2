package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Formateur {

	@Id
	private int id;
	@Column(name="name")
	private String nom;
	@Column(name="firstName")
	private String prenom;
	//@ManyToMany(mappedBy="formateur")
	//private List<Eleve> eleves;

	
	public Formateur(){}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
