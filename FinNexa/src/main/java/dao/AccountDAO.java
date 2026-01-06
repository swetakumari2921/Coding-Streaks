package dao;

import java.sql.*;

import util.DBConnection;

public class AccountDAO {
	public boolean deposit(int userId, double amount) {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DBConnection.getConnetion();

			String sql = "UPDATE ACCOUNTS SET BALANCE = BALANCE + ? WHERE USER_ID = ?";
			ps = con.prepareStatement(sql);
			ps.setDouble(1, amount);
			ps.setInt(2, userId);

			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean withdraw(int userId, double amount) {
		Connection con = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		ResultSet rs = null;

		try {
			con = DBConnection.getConnetion();

			String checkSql1 = "SELECT BALANCE FROM ACCOUNTS WHERE USER_ID = ?";
			ps1 = con.prepareStatement(checkSql1);
			ps1.setInt(1, userId);
			rs = ps1.executeQuery();

			if (rs.next()) {
				double balance = rs.getDouble("balance");

				if (balance < amount) {
					return false;
				}
			}

			String updateSql = "UPDATE ACCOUNTS SET BALANCE = BALANCE - ? WHERE USER_ID = ?";
			ps2 = con.prepareStatement(updateSql);
			ps2.setDouble(1, amount);
			ps2.setInt(2, userId);

			return ps2.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean transfer(int senderUserId, String receiverAcc, double amount) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = DBConnection.getConnetion();
			con.setAutoCommit(false);

			String senderSql = "SELECT balance FROM accounts WHERE user_id = ?";
			ps = con.prepareStatement(senderSql);
			ps.setInt(1, senderUserId);
			rs = ps.executeQuery();

			if (!rs.next() || rs.getDouble("balance") < amount) {
				con.rollback();
				return false;
			}

			String receiverSql = "SELECT user_id FROM accounts WHERE account_no = ?";
			ps = con.prepareStatement(receiverSql);
			ps.setString(1, receiverAcc);
			rs = ps.executeQuery();

			if (!rs.next()) {
				con.rollback();
				return false;
			}

			int receiverUserId = rs.getInt("user_id");

			String debitSql = "UPDATE accounts SET balance = balance - ? WHERE user_id = ?";
			ps = con.prepareStatement(debitSql);
			ps.setDouble(1, amount);
			ps.setInt(2, senderUserId);
			ps.executeUpdate();

			String creditSql = "UPDATE accounts SET balance = balance + ? WHERE user_id = ?";
			ps = con.prepareStatement(creditSql);
			ps.setDouble(1, amount);
			ps.setInt(2, receiverUserId);
			ps.executeUpdate();

			con.commit();
			return true;

		} catch (Exception e) {
			try {
				con.rollback();
			} catch (Exception ex) {
			}
			e.printStackTrace();
			return false;
		}
	}
}
