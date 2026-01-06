package controller;

import java.io.IOException;
import java.util.List;

import dao.TransactionDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Transaction;
import model.User;

@WebServlet("/TransactionServlet")
public class TransactionServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		User user = (User) session.getAttribute("user");
		
		TransactionDAO dao = new TransactionDAO();
		List<Transaction> list = dao.getTransactions(user.getUserId());
		
		req.setAttribute("transactions", list);
		req.getRequestDispatcher("transactions.jsp").forward(req, resp);
	}
}

//“FinNexa is a dynamic banking web application built using Core Java, JSP, Servlets, JDBC, and MySQL.
//I followed MVC architecture, implemented secure session-based login, and handled core banking features like deposit, withdrawal, fund transfer using JDBC transactions.
//All user activities are recorded and displayed through a transaction history module.”
