package com.staffedge.controller;

import java.io.IOException;
import com.staffedge.dao.EmployeeDAO;
import com.staffedge.model.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {

    private EmployeeDAO dao = new EmployeeDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        int age = Integer.parseInt(request.getParameter("age"));
        String department = request.getParameter("department");
        double salary = Double.parseDouble(request.getParameter("salary"));

        // Passing 0 because MySQL AUTO_INCREMENT handles the ID
        Employee emp = new Employee(0, firstName, lastName, email, phone, age, department, salary);

        dao.addEmployee(emp);
        response.sendRedirect("viewEmployee");
    }
}