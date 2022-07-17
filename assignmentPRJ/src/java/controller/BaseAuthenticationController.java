/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Account;
import model.Feature;
import model.Role;

/**
 *
 * @author LEGION OS
 */

public abstract class BaseAuthenticationController extends HttpServlet {
   
    private boolean isAuthenticated(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("account");
        if(account ==null)
            return false;
        else
        {
            String visitingUrl = request.getServletPath();
            for (Role role : account.getRoles()) {
                for (Feature feature : role.getFeatures()) {
                    if(feature.getUrl().equals(visitingUrl))
                        return true;
                }
            }
            return false;
        }
    }
    protected abstract void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;
    protected abstract void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        if(isAuthenticated(request))
        {
            //do something
            processGet(request, response);
        }
        else
        {
            response.getWriter().println("access denied!");
        }
    } 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       if(isAuthenticated(request))
        {
            //do something
            processPost(request, response);
        }
        else
        {
            response.getWriter().println("access denied!");
        }
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    
}
