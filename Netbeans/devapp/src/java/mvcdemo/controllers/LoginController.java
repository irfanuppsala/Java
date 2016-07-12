/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcdemo.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import mvcdemo.model.Authenticator;
import mvcdemo.model.User;
 
//import sun.text.normalizer.ICUBinary.Authenticate;

/**
 *
 * @author elev4
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	public LoginController() {
		super();
	}
 
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
 
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		RequestDispatcher rd = null;
 
		Authenticator authenticator = new Authenticator();
		String result = null;
            try {
                result = authenticator.authenticate(username, password);
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
		System.out.println(result);
                
                if (result.equals("success")) {
			rd = request.getRequestDispatcher("/success.jsp");
			User user = new User(username, password);
			request.setAttribute("user", user);
		} else {
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
	}
 
}
