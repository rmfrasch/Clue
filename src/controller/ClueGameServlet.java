package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ClueGame;

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
	 * Checks to see which button the user clicks.  Goes to various pages once one it clicked.
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("thisClicked");
		if(action == null) {
			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}
		else if (action.equals("New Game")) {

			Integer i = Integer.parseInt(request.getParameter("playerNum"));
			ClueGame cg = new ClueGame();
			cg.setPlayerNum(i);
			ClueGameHelper thisGame = new ClueGameHelper();
			thisGame.newGame(cg);
			getServletContext().getRequestDispatcher("/current-game.jsp").forward(request, response);

		} else if (action.equals("View all prevoius games")) {
			getServletContext().getRequestDispatcher("/viewAllGamesServlet").forward(request, response);
		}

	}

}
