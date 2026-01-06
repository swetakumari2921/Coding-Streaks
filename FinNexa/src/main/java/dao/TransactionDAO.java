package dao;

import java.sql.*;
import java.util.*;

import model.Transaction;
import util.DBConnection;

public class TransactionDAO {
	public void addTransaction(int userId, String type, double amount) {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DBConnection.getConnetion();

			String sql = "INSERT INTO TRANSACTIONS(ACCOUNT_ID, TYPE, AMOUNT, TXN_DATE)"
					+ "SELECT ACCOUNT_ID, ?, ?, NOW() FROM ACCOUNTS WHERE USER_ID=?";

			ps = con.prepareStatement(sql);
			ps.setString(1, type);
			ps.setDouble(2, amount);
			ps.setInt(3, userId);

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addTransactionByAccount(String accNo, String type, double amount) {
		try (Connection con = DBConnection.getConnetion()) {
			String sql = "INSERT INTO TRANSACTIONS(ACCOUNT_ID, TYPE, AMOUNT, TXN_DATE) "
					+ "SELECT ACCOUNT_ID, ?, ?, NOW() FROM ACCOUNTS WHERE ACCOUNT_NO = ?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, type);
			ps.setDouble(2, amount);
			ps.setString(3, accNo);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Transaction> getTransactions(int userId) {
		List<Transaction> list = new ArrayList<>();

		String sql = "SELECT T.TYPE, T.AMOUNT, T.TXN_DATE " + "FROM TRANSACTIONS T "
				+ "JOIN ACCOUNTS A ON T.ACCOUNT_ID = A.ACCOUNT_ID" + "WHERE A.USER_ID = ? "
				+ "ORDER BY T.TXN_DATE DESC";

		try (Connection con = DBConnection.getConnetion(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Transaction t = new Transaction();
				t.setType(rs.getString("type"));
				t.setAmount(rs.getDouble("amount"));
				t.setTxnDate(rs.getTimestamp("txn_date"));
				list.add(t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}
}
