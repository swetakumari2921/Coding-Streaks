<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.staffedge.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Employee</title>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600&display=swap" rel="stylesheet">
    <style>
        body { font-family: 'Inter', sans-serif; background-color: #d1e8da; padding: 40px 20px; }
        .container { max-width: 600px; margin: 0 auto; background: #edf7f1; padding: 24px 40px; border-radius: 12px; box-shadow: 0 12px 40px rgba(0,0,0,0.08); }
        h2 { text-align: center; margin-bottom: 20px; }
        input { width: 100%; padding: 8px 12px; margin-bottom: 12px; border: 1px solid #1db954; border-radius: 6px; }
        .btn { padding: 10px 20px; border: none; border-radius: 500px; cursor: pointer; font-weight: 600; }
        .btn-cancel { background-color: #dee9e2; margin-right: 10px; }
        .btn-add { background-color: #1db954; color: white; }
        .btn-add:hover { background-color: #1ed760; }
    </style>
</head>
<body>

<div class="container">
    <h2>Update Employee</h2>

    <%
        Employee emp = (Employee) request.getAttribute("employee");
        if(emp != null){
    %>

<form action="updateEmployee" method="post">
        <input type="hidden" name="empId" value="<%= emp.getEmpId() %>" />

        <label>First name</label>
        <input type="text" name="firstName" value="<%= emp.getFirstName() %>" required />

        <label>Last name</label>
        <input type="text" name="lastName" value="<%= emp.getLastName() %>" required />

        <label>Email</label>
        <input type="email" name="email" value="<%= emp.getEmail() %>" required />

        <label>Phone</label>
        <input type="tel" name="phone" value="<%= emp.getPhone() %>" required />

        <label>Age</label>
        <input type="number" name="age" value="<%= emp.getAge() %>" required />

        <label>Department</label>
        <input type="text" name="department" value="<%= emp.getDepartment() %>" required />

        <label>Salary</label>
        <input type="number" step="0.01" name="salary" value="<%= emp.getSalary() %>" required />

        <div style="margin-top: 20px; text-align: center;">
            <button type="button" class="btn btn-cancel" onclick="window.location.href='viewEmployee'">Cancel</button>
            <button type="submit" class="btn btn-add">Update Employee</button>
        </div>
    </form>

    <% } %>

</div>
</body>
</html>
