package com.staffedge.controller;

import java.io.IOException;
import com.staffedge.dao.EmployeeDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet {

    private EmployeeDAO dao = new EmployeeDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int empId = Integer.parseInt(request.getParameter("empId"));
        dao.deleteEmployee(empId);

        // This must match your @WebServlet mapping exactly
        response.sendRedirect("viewEmployee");
    }
}
