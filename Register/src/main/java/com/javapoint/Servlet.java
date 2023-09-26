package com.javapoint;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Create a User object with the user input
        User user = new User(firstname, lastname, email, password);

        // Validate email and password
        boolean isEmailValid = user.isValidEmail(email);
        boolean isPasswordValid = user.isValidPassword(password);

        // Check validation results
        if (!isEmailValid) {
            request.setAttribute("emailError", "Invalid email address");
        }

        if (!isPasswordValid) {
            request.setAttribute("passwordError", "Invalid password");
        }

        // If both email and password are valid, you can proceed with registration
        if (isEmailValid && isPasswordValid) {
            // Perform registration logic here

            // Redirect to a success page
            response.sendRedirect("registration-success.jsp");
        } else {
            // If validation fails, forward to an error page
            request.getRequestDispatcher("registration-error.jsp").forward(request, response);
        }
    }

}
