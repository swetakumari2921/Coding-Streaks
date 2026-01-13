<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.staffedge.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee List</title>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600&display=swap" rel="stylesheet">
    <style>
        :root {
            --sp-green: #1db954;
            --body-bg: #d1e8da;
            --table-bg: #edf7f1;
            --text-main: #121212;
        }

        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }

        body {
            font-family: 'Inter', sans-serif;
            background-color: var(--body-bg);
            padding: 40px 20px;
            color: var(--text-main);
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        .table-container {
            max-width: 1100px;
            margin: 0 auto;
            background-color: var(--table-bg);
            padding: 10px;
            border-radius: 12px;
            box-shadow: 0 12px 40px rgba(0,0,0,0.08);
            border: 1px solid #c2d6ca;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 14px 16px;
            border-bottom: 1px solid #c2d6ca;
            font-size: 14px;
            text-align: left;
        }

        th {
            background-color: var(--sp-green);
            color: white;
        }

        tr:nth-child(even) {
            background-color: rgba(255,255,255,0.4);
        }

        tr:hover {
            background-color: rgba(29,185,84,0.05);
        }

        .actions a {
            text-decoration: none;
            font-weight: 500;
            margin-right: 6px;
            color: #1db954;
        }

        .actions a:hover {
            text-decoration: underline;
        }

        .search-box {
            text-align: center;
            margin-bottom: 20px;
        }

        .search-box input {
            padding: 8px 12px;
            width: 250px;
            border: 1px solid #1db954;
            border-radius: 6px;
        }

        .search-box button {
            padding: 8px 16px;
            border: none;
            border-radius: 6px;
            background-color: #1db954;
            color: white;
            font-weight: 600;
            cursor: pointer;
        }

        .search-box a {
            padding: 8px 16px;
            margin-left: 8px;
            border-radius: 6px;
            background-color: #dee9e2;
            color: #121212;
            text-decoration: none;
        }
        .btn-delete {
    color: #e74c3c !important; /* Red color */
    font-weight: bold;
}
.btn-delete:hover {
    text-decoration: underline;
    color: #c0392b !important;
}



/* Centered Modal Styling */
.modal-overlay {
    display: none; /* Hidden by default */
    position: fixed;
    top: 0; left: 0;
    width: 100%; height: 100%;
    background: rgba(0, 0, 0, 0.6); /* Darkens the background */
    z-index: 9999;
    justify-content: center;
    align-items: center;
}

.modal-content {
    background: white;
    padding: 30px;
    border-radius: 15px;
    width: 380px;
    text-align: center;
    box-shadow: 0 15px 30px rgba(0,0,0,0.3);
    animation: fadeIn 0.3s ease;
}

@keyframes fadeIn {
    from { transform: scale(0.8); opacity: 0; }
    to { transform: scale(1); opacity: 1; }
}

.modal-btns {
    display: flex;
    justify-content: center;
    gap: 15px;
    margin-top: 25px;
}

.btn-confirm { background: #e74c3c; color: white; padding: 10px 25px; border-radius: 8px; text-decoration: none; font-weight: 600; }
.btn-cancel { background: #dee9e2; color: #121212; padding: 10px 25px; border-radius: 8px; border: none; cursor: pointer; font-weight: 600; }

    </style>
</head>
<body>

<h2>Employee List</h2>

<div class="search-box">
    <form action="viewEmployee" method="get">
        <input type="text" name="keyword"
               placeholder="Search by name or department"
               value="<%= request.getAttribute("keyword") != null ? request.getAttribute("keyword") : "" %>">
        <button type="submit">Search</button>
        <a href="viewEmployee">Reset</a>
    </form>
</div>

<div class="table-container">
    <table>
        <thead>
            <tr>
            		<th>Action</th>
                <th>ID</th>
                <th>First name</th>
                <th>Last name</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Age</th>
                <th>Department</th>
                <th>Salary</th>
            </tr>
        </thead>
        <tbody>
        <%
            List<Employee> list = (List<Employee>) request.getAttribute("employeeList");
            if(list != null && !list.isEmpty()){
                for(Employee emp : list){
        %>
            <tr>
                <td class="actions">
    <a href="updateEmployee?empId=<%= emp.getEmpId() %>">Edit</a>
    <span style="color: #c2d6ca; margin: 0 5px;">|</span>
    <a href="javascript:void(0)" 
   class="btn-delete" 
   onclick="openDeleteModal('<%= emp.getEmpId() %>')">
   Delete
</a>            
</td>
		</td>
                <td><%= emp.getEmpId() %></td>
                <td><%= emp.getFirstName() %></td>
                <td><%= emp.getLastName() %></td>
                <td><%= emp.getEmail() %></td>
                <td><%= emp.getPhone() %></td>
                <td><%= emp.getAge() %></td>
                <td><%= emp.getDepartment() %></td>
                <td><%= String.format("%.2f", emp.getSalary()) %></td>
            </tr>
        <%
                }
            } else {
        %>
            <tr>
                <td colspan="9" style="text-align:center; padding: 30px; color: #666;">
                    No employees found in the system.
                </td>
            </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>
<br>
<br>
<div style="text-align: center; margin-bottom: 20px;">
    <a href="addEmployee.jsp" style="
        background-color: #1db954; 
        color: white; 
        padding: 10px 20px; 
        text-decoration: none; 
        border-radius: 500px; 
        font-weight: 600;
        display: inline-block;
    ">
        + Add New Employee
    </a>
</div>
<div id="deleteModal" class="modal-overlay">
    <div class="modal-content">
        <h3 style="margin-bottom: 10px;">Confirm Delete</h3>
        <p>Are you sure you want to remove this employee? This cannot be undone.</p>
        <div class="modal-btns">
            <button class="btn-cancel" onclick="closeModal()">No, Cancel</button>
            <a id="confirmDeleteLink" href="#" class="btn-confirm">Yes, Delete</a>
        </div>
    </div>
</div>

<script>
    function openDeleteModal(empId) {
        // Find the "Yes, Delete" button and give it the real delete URL
        document.getElementById('confirmDeleteLink').href = "deleteEmployee?empId=" + empId;
        // Show the centered popup
        document.getElementById('deleteModal').style.display = 'flex';
    }

    function closeModal() {
        // Hide the popup
        document.getElementById('deleteModal').style.display = 'none';
    }

    // Close modal if user clicks outside the white box
    window.onclick = function(event) {
        let modal = document.getElementById('deleteModal');
        if (event.target == modal) {
            closeModal();
        }
    }
</script>
</body>
</html>
