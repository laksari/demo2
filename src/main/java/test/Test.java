package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dao.DaoEleveHib;
import model.Eleve;
import model.Formateur;
import model.Salle;
import model.Secu;


public class Test {

	public static void main(String[] args) {
		
		
		
		DaoEleveHib eleveDao = new DaoEleveHib();
		
		Eleve eleve = new Eleve();
		//eleve.setId(7);
		eleve.setNom("toto5");
		eleve.setPrenom("titi5");
		
		eleveDao.insert(eleve);
		
		//eleveDao.delete(6);
		
		/*List<Eleve> listeEleve = eleveDao.findAll();
		for(Eleve e:listeEleve){
	    	 System.out.println(e);
		}
		
		eleveDao.delete(4);
		
		listeEleve = eleveDao.findAll();
		for(Eleve e:listeEleve){
	    	 System.out.println(e);
		}*/
		
	
	}

}
