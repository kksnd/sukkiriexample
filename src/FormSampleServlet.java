

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormSampleServlet
 */
@WebServlet("/FormSampleServlet")
public class FormSampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get request parameters
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		
		// check request parameters
		String errorMsg = "";
		
		if (name == null) {
			errorMsg += "Name is empty.<br>";
		} else if (name.length() == 0) {
			errorMsg += "Name is empty.<br>";			
		}
		
		if (gender == null) {
			errorMsg += "Gender is empty.<br>";
		} else if (gender.length() == 0) {
			errorMsg += "Gender is empty.<br>";
		} else {
			if (gender.equals("0")) {
				gender = "male";
			} else if (gender.equals("1")) {
				gender = "female";
			} else {
				gender = "question";
			}
		}
		
		// set message
		String msg = name + " was registered (" + gender + ").";
		if (errorMsg.length() > 0) {
			msg = errorMsg;
		}
		
		// output HTML
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Result</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + msg + "</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
