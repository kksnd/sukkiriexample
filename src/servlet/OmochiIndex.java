package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.SiteEV;
import model.SiteEVLogic;

/**
 * Servlet implementation class OmochiIndex
 */
@WebServlet("/OmochiIndex")
public class OmochiIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OmochiIndex() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get SiteEV instance from application scope
		ServletContext application = this.getServletContext();
		SiteEV siteEV = (SiteEV) application.getAttribute("siteEV");
		
		// if first request (there is no instance)
		if (siteEV == null) {
			siteEV = new SiteEV();
		}
		
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		
		SiteEVLogic siteEVLogic = new SiteEVLogic();
		
		// do nothing when it is first request
		if (action != null) {
			if (action.equals("like")) {
				siteEVLogic.like(siteEV);
			} else if (action.equals("dislike")) {
				siteEVLogic.dislike(siteEV);
			}
		}
		
		// store siteEV to application scope
		application.setAttribute("siteEV", siteEV);
		
		// forward
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/omochiIndex.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
