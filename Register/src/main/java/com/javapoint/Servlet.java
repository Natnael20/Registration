package com.javapoint;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<User> users = new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   String username = request.getParameter("username");
	       String password = request.getParameter("password");

	        // Validate the input (you can add more robust validation as needed)
	        if (username != null && !username.isEmpty() && password != null && !password.isEmpty()) {
	            // Create a new User object and add it to the list
	            User user = new User(username, password);
	            users.add(user);

	            // Redirect to a success page
	            response.sendRedirect("registration-success.jsp");
	        } else {
	            // Redirect to an error page (e.g., if input is invalid)
	            response.sendRedirect("registration-error.jsp");
	        }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
