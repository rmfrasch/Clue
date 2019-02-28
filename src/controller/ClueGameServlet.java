package controller;

import java.io.IOException;
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
		// Thie goes to the current-game.jsp
		else if (action.equals("New Game")) {

			Integer i = Integer.parseInt(request.getParameter("playerNum"));
			ClueGame c = new ClueGame(i);
			ClueGameHelper thisGame = new ClueGameHelper();
			thisGame.newGame(c);
			getServletContext().getRequestDispatcher("/current-game.jsp").forward(request, response);
		}
		// This submits the data to the database from the current-game.jsp
		else if (action.contentEquals("Submit")) {
			ClueGameHelper thisGame = new ClueGameHelper();
			ClueSheet notIt = new ClueSheet(request.getParameter("scarlet"), request.getParameter("mustard"),
					request.getParameter("white"), request.getParameter("green"), request.getParameter("peacock"),
					request.getParameter("plum"), request.getParameter("knife"), request.getParameter("candlestick"),
					request.getParameter("pipe"), request.getParameter("revolver"), request.getParameter("rope"),
					request.getParameter("wrench"), request.getParameter("ballroom"), request.getParameter("kitchen"),
					request.getParameter("conservatory"), request.getParameter("billard"), request.getParameter("dining"),
					request.getParameter("library"), request.getParameter("hall"), request.getParameter("study"),
					request.getParameter("lounge"));
			thisGame.completedGame(notIt);
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

	}

}
