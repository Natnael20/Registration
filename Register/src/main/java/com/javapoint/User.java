package com.javapoint;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	
	private String firstName;
	private String LastName;
	private String email;
	private String password;
	
	public User(String Fname, String Lname, String email, String password) {
		this.firstName = Fname;
		this.LastName = Lname;
		this.email = email;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return LastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
    public boolean isValidEmail(String email) {
        if (email == null) {
            return false; // Email is null, so it's invalid
        }

        // Regular expression pattern for a valid email address (RFC 5322 compliant)
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);

        boolean isValid = matcher.matches();
        
        return isValid;
    }

    public boolean isValidPassword(String password) {
        if (password == null) {
            return false; // Password is null, so it's invalid
        }

        // Define a regular expression pattern for a strong password.
        String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";

        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);

        boolean isValid = matcher.matches();

        return isValid;
    }
	
}
