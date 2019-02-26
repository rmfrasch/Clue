package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ClueGame;

public class ClueGameHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Clue");

	// Connects to the JPA to control the database and insert a field.
	public void newGame(ClueGame c) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
	}

	// Shows all items in the database
	public List<ClueGame> showAllGames() {
		EntityManager em = emfactory.createEntityManager();
		List<ClueGame> games = em.createQuery("SELECT i FROM CLUE i").getResultList();
		return games;
	}

	// Closes connections to the database after we're done with the program.
	public void cleanUp() {
		emfactory.close();
	}
}
