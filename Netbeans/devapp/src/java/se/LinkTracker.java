/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author elev4
 */
public class LinkTracker extends HttpServlet {
static private Hashtable links = new Hashtable();

  String tstamp;
  public LinkTracker() {
    tstamp = new Date().toString();
  }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        response.setHeader("Refresh", "5; URL=http://localhost:8084/devapp/");
        String link = request.getParameter("link");
        if (link != null && !link.equals("")) {
          synchronized (links){
            Integer count = (Integer) links.get(link);
            if (count == null) {
              links.put(link, new Integer(1));
            }
            else {
              links.put(link, new Integer(1+count.intValue()));
            }
          }
          response.sendRedirect(link);
        }
        else {
          response.setContentType("text/html");
          PrintWriter out = response.getWriter();
          request.getSession();
          out.println("<html>");
          out.println("<head>");
          out.println("<title>Links Tracker Servlet</title>");
          out.println("</head>");
          out.println("<body>");
          out.println("<p>Links Tracked Since");
          out.println(tstamp+":</p>");
          if (links.size() != 0) {
//            Enumeration enum = links.keys();
//            while (enum.hasMoreElements()) {
//            String key = (String)enum.nextElement();
//            int count = ((Integer)links.get(key)).intValue();
//            out.println(key+" : "+count+" visits<br>");
//        }
      }
          else {
            out.println("No links have been tracked!\n");
          }
          out.println("\n<form action=\"index.jsp\" method=\"get\">\n" +
            "<input type=\"submit\" value=\"Back to home\">\n" +
            "</form>");
          out.println("</body>");
          out.println("</html>");
        }
    }

    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        doGet(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
