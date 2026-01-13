package com.staffedge.controller;

import java.io.IOException;
import java.util.List;

import com.staffedge.dao.EmployeeDAO;
import com.staffedge.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/viewEmployee")
public class ViewEmployeeServlet extends HttpServlet {

    EmployeeDAO dao = new EmployeeDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String keyword = request.getParameter("keyword");
        List<Employee> list;

        // Logic: If keyword is provided and not empty, search. Otherwise, get all.
        if (keyword != null && !keyword.trim().isEmpty()) {
            list = dao.searchEmployees(keyword);
            // Pass the keyword back so the search box keeps the text
            request.setAttribute("keyword", keyword);
        } else {
            list = dao.getAllEmployees();
        }

        request.setAttribute("employeeList", list);
        request.getRequestDispatcher("viewEmployee.jsp").forward(request, response);
    }
}
