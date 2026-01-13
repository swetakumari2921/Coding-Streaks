package com.staffedge.controller;

import java.io.IOException;

import com.staffedge.dao.EmployeeDAO;
import com.staffedge.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {

    private EmployeeDAO dao = new EmployeeDAO();

    // Step 1: Load employee info for editing
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int empId = Integer.parseInt(request.getParameter("empId"));
        Employee emp = dao.getEmployeeById(empId);

        if(emp != null){
            request.setAttribute("employee", emp);
            request.getRequestDispatcher("updateEmployee.jsp").forward(request, response);
        } else {
            response.sendRedirect("viewEmployee");
        }
    }

    // Step 2: Save updated employee info
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int empId = Integer.parseInt(request.getParameter("empId"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        int age = Integer.parseInt(request.getParameter("age"));
        String department = request.getParameter("department");
        double salary = Double.parseDouble(request.getParameter("salary"));

        Employee updatedEmp = new Employee(empId, firstName, lastName,
                email, phone, age, department, salary);

        dao.updateEmployee(updatedEmp);

        response.sendRedirect("viewEmployee");
    }
}
