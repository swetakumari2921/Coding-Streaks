package com.staffedge.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.staffedge.model.Employee;
import com.staffedge.util.DBConnection;

public class EmployeeDAO {

    public void addEmployee(Employee e) {
        String sql = "INSERT INTO employee (first_name, last_name, email, phone, age, department, salary) VALUES (?,?,?,?,?,?,?)";
        try (Connection con = DBConnection.getConnection(); 
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, e.getFirstName());
            ps.setString(2, e.getLastName());
            ps.setString(3, e.getEmail());
            ps.setString(4, e.getPhone());
            ps.setInt(5, e.getAge());
            ps.setString(6, e.getDepartment());
            ps.setDouble(7, e.getSalary());
            ps.executeUpdate();
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM employee")) {
            while(rs.next()) {
                list.add(new Employee(rs.getInt("emp_id"), rs.getString("first_name"), 
                    rs.getString("last_name"), rs.getString("email"), rs.getString("phone"), 
                    rs.getInt("age"), rs.getString("department"), rs.getDouble("salary")));
            }
        } catch(Exception e) { e.printStackTrace(); }
        return list;
    }

    public Employee getEmployeeById(int id) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM employee WHERE emp_id=?")) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                return new Employee(rs.getInt("emp_id"), rs.getString("first_name"), 
                    rs.getString("last_name"), rs.getString("email"), rs.getString("phone"), 
                    rs.getInt("age"), rs.getString("department"), rs.getDouble("salary"));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return null;
    }

    public void updateEmployee(Employee e) {
        String sql = "UPDATE employee SET first_name=?, last_name=?, email=?, phone=?, age=?, department=?, salary=? WHERE emp_id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, e.getFirstName());
            ps.setString(2, e.getLastName());
            ps.setString(3, e.getEmail());
            ps.setString(4, e.getPhone());
            ps.setInt(5, e.getAge());
            ps.setString(6, e.getDepartment());
            ps.setDouble(7, e.getSalary());
            ps.setInt(8, e.getEmpId());
            ps.executeUpdate();
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    public void deleteEmployee(int id) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement("DELETE FROM employee WHERE emp_id=?")) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) { e.printStackTrace(); }
    }
    
    public List<Employee> searchEmployees(String keyword) {
        List<Employee> list = new ArrayList<>();
        // This query checks EVERY column in your table
        String sql = "SELECT * FROM employee WHERE " +
                     "emp_id LIKE ? OR " +
                     "first_name LIKE ? OR " +
                     "last_name LIKE ? OR " +
                     "email LIKE ? OR " +
                     "phone LIKE ? OR " +
                     "age LIKE ? OR " +
                     "department LIKE ? OR " +
                     "salary LIKE ?";
        
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            String searchKey = "%" + keyword + "%";
            
            // We set the same keyword for all 8 parameters
            for(int i = 1; i <= 8; i++) {
                ps.setString(i, searchKey);
            }
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                list.add(new Employee(
                    rs.getInt("emp_id"), 
                    rs.getString("first_name"), 
                    rs.getString("last_name"), 
                    rs.getString("email"), 
                    rs.getString("phone"), 
                    rs.getInt("age"), 
                    rs.getString("department"), 
                    rs.getDouble("salary")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}