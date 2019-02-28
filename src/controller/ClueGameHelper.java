package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ClueGame;
import model.ClueSheet;
import model.ClueGame;

public class ClueGameHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Clue");

	// Connects to the JPA to control the database and insert a Clue Game. May need to update this to accept a 'ClueSheet' argument.
	public void newGame(ClueGame c) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
	}
	
	public void completedGame(ClueSheet c) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
	}
	// Shows all items in the database
	public List<ClueGame> showAllGames() {
		EntityManager em = emfactory.createEntityManager();
		List<ClueGame> games = em.createQuery("SELECT i FROM clue i").getResultList();
		return games;
	}
	
	// Deletes an item from the database and commits.
		public void deleteItem(int gameId) {
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			
			ClueGame found = em.find(ClueGame.class, gameId);
	
			
			em.remove(found);
			em.getTransaction().commit();
			em.close();
		}
		// searches for a particular record in the table based on the fieldID.
		public ClueGame searchForItemByGameID(int gameId) {
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			ClueGame found = em.find(ClueGame.class, gameId);
			em.close();
			return found;
		}
		//Searches for a particular record in the table based on the Field Name.
		/*public List<ClueGame> searchForItemByFieldName(String FieldName) {
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			TypedQuery<ClueGame> typedQuery = em
					.createQuery("select fd from FIELD fd where fd.fieldName = :selectedItem", ClueGame.class);
			typedQuery.setParameter("selectedItem", FieldName);
			List<ClueGame> foundItems = typedQuery.getResultList();
			em.close();
			return foundItems;
		} */
	//Updates the variable of the object and commits the changes.
		public void updateGame(ClueGame toEdit) {
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			em.merge(toEdit);
			em.getTransaction().commit();
			em.close();
		}
		//Closes connections to the database after we're done with the program.
		public void cleanUp() {
			emfactory.close();
		}
}
