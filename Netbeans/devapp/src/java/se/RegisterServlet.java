/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author elev4
 */

//@WebServlet(urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws IOException, ServletException {



  }
  @Override
  public void doPost(HttpServletRequest request,
                    HttpServletResponse response)
    throws IOException, ServletException {
    //doGet(request, response);

    String name = request.getParameter("name");
    String group = request.getParameter("group");
    String pass = request.getParameter("pass");
    System.out.println("Name :"+ name);
    System.out.println("group :"+ group);
    System.out.println("pass :"+ pass);

  }
}
