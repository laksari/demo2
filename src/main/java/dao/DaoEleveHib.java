package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Eleve;

public class DaoEleveHib implements DaoEleve {

	@Override
	public void insert(Eleve obj) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("formation-jpa");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(obj);

		tx.commit();

		em.close();
		emf.close();

	}

	@Override
	public List<Eleve> findAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("formation-jpa");
		EntityManager em = emf.createEntityManager();

		Query req = em.createQuery("FROM Eleve ");
		List<Eleve> lst = req.getResultList();

		em.close();
		emf.close();

		return lst;
	}

	@Override
	public void update(Eleve obj) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("formation-jpa");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.merge(obj);

		em.merge(obj);

		tx.commit();
		em.close();
		emf.close();

	}

	@Override
	public Eleve findByKey(Integer key) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("formation-jpa");
		EntityManager em = emf.createEntityManager();

		Eleve eleve = em.find(Eleve.class, key);

		em.close();
		emf.close();

		return eleve;
	}

	@Override
	public void delete(Integer key) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("formation-jpa");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		Eleve eleve = em.find(Eleve.class, key);
		em.remove(eleve);

		tx.commit();
		em.close();
		emf.close();
	}

}
