package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
import model.RegisterUserLogic;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// forward destination
		String forwardPath = null;
		
		// decide action
		String action = request.getParameter("action");
		
		if (action == null) {
			// set forward path
			forwardPath = "WEB-INF/jsp/registerForm.jsp";
		} else if (action.equals("done")) {
			// get user from session scope
			HttpSession session = request.getSession();
			User registerUser = (User) session.getAttribute("registerUser");
			
			// register user
			RegisterUserLogic registerUserLogic = new RegisterUserLogic();
			registerUserLogic.execute(registerUser);
			
			// delete instance
			session.removeAttribute("registerUser");
			
			// set forward path
			forwardPath = "WEB-INF/jsp/registerDone.jsp";
		}
		
		// forward
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get request parameters
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		// create user instance
		User registerUser = new User(id, name, pass);
		
		// set user to session scope
		HttpSession session = request.getSession();
		session.setAttribute("registerUser", registerUser);
		
		// forward
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/registerConfirm.jsp");
		dispatcher.forward(request, response);
	}

}
