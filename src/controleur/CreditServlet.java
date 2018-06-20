package controleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreditServlet
 */
@WebServlet(name = "CreditServlet", urlPatterns="/VueCredit.jsp")
public class CreditServlet extends HttpServlet {
	private static final long serialVersionUID = 6353171579141334134L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// Renvois vers la page de vue crédit
		//this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/VueCredit.jsp").forward(request, response);
		
		request.getRequestDispatcher("/WEB-INF/jsp/VueCredit.jsp").forward(request, response);
	}
}
