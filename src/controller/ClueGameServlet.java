package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ClueGame;
import model.ClueSheet;

/**
 * Servlet implementation class ClueGameServlet
 */
@WebServlet("/ClueGameServlet")
public class ClueGameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClueGameServlet() {
		super();

	}

	/**
	 * Checks to see which button the user clicks. Goes to various pages once one it
	 * clicked.
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("thisClicked");
		if (action == null) {
			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}

		// This goes back to the index from the current-game.jsp
		else if (action.contentEquals("Back")) {
			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}
		// This goes to the view all viewAllgamesServlet.
		else if (action.equals("View all previous games")) {
			getServletContext().getRequestDispatcher("/viewAllGamesServlet").forward(request, response);
		}
		// Thie goes to the current-game.jsp

		else if (action.equals("New Game")) {

			Integer i = Integer.parseInt(request.getParameter("playerNum"));
			LocalDate ld = LocalDate.now();
			ClueGame c = new ClueGame(i, ld);
			request.setAttribute("GameNum", c.getGameId());
			
			ClueGameHelper thisGame = new ClueGameHelper();
			thisGame.newGame(c);
			getServletContext().getRequestDispatcher("/current-game.jsp").forward(request, response);
			
			
		}
		// This submits the data to the database from the current-game.jsp
		else if (action.contentEquals("Submit")) {
			ClueGameHelper cgh = new ClueGameHelper();
			ClueGame c = (ClueGame) request.getAttribute("GameNum");
			//ClueGame cg = cgh.searchForItemByGameID(c);
			ClueSheet cs = new ClueSheet();
			String scarlet = request.getParameter("scarlet");
			String mustard = request.getParameter("mustard");
			String white = request.getParameter("white");
			String green = request.getParameter("green");
			String peacock = request.getParameter("peacock");
			String plum = request.getParameter("plum");
			String ballroom = request.getParameter("ballroom");
			String kitchen = request.getParameter("kitchen");
			String conservatory = request.getParameter("conservatory");
			String billard = request.getParameter("billard");
			String dining = request.getParameter("dining");
			String library = request.getParameter("library");
			String hall = request.getParameter("hall");
			String study = request.getParameter("study");
			String lounge = request.getParameter("lounge");
			String knife = request.getParameter("knife");
			String candlestick = request.getParameter("candlestick");
			String pipe = request.getParameter("pipe");
			String revolver = request.getParameter("revolver");
			String rope = request.getParameter("rope");
			String wrench = request.getParameter("wrench");
			
			cs.setScarlet(scarlet);
			cs.setMustard(mustard);
			cs.setWhite(white);
			cs.setGreen(green);
			cs.setPeacock(peacock);
			cs.setPlum(plum);
			cs.setBallroom(ballroom);
			cs.setKitchen(kitchen);
			cs.setConservatory(conservatory);
			cs.setBillard(billard);
			cs.setDining(dining);
			cs.setLibrary(library);
			cs.setHall(hall);
			cs.setStudy(study);
			cs.setLounge(lounge);
			cs.setKnife(knife);
			cs.setCandlestick(candlestick);
			cs.setPipe(pipe);
			cs.setRevolver(revolver);
			cs.setRope(rope);
			cs.setWrench(wrench);
			
			//cg.setClueSheet(cs);
			cgh.updateSheet(cs);
			
			
			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}

	}

}
