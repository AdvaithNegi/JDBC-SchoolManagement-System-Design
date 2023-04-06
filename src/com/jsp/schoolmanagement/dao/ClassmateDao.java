package com.jsp.schoolmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.schoolmanagement.dto.Classmate;
import com.jsp.schoolmanagement.util.HelperClass;

public class ClassmateDao {

	HelperClass helperClass = new HelperClass();

	public Classmate saveClassmate(Classmate classmate) {

		Connection connection = helperClass.getConnection();
		String sql = "insert into classmate values(?,?,?,?)";
		try {

			// Create Statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, classmate.getId());
			preparedStatement.setString(2, classmate.getName());
			preparedStatement.setString(3, classmate.getEmail());
			preparedStatement.setString(4, classmate.getLoc());

			// Execute Statement
			preparedStatement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close Connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return classmate;
	}

	public boolean deleteClassmate(int id) {

		Connection connection = helperClass.getConnection();
		String sql = "delete from classmate where id=?";
		try {

			// Create Statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);

			// Execute Statement
			preparedStatement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close Connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	public Classmate updateClassmate(Classmate classmate) {

		Connection connection = helperClass.getConnection();
		String sql = "update classmate set name=?,email=?,loc=? where id=?";

		try {

			// Create Statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, classmate.getName());
			preparedStatement.setString(2, classmate.getEmail());
			preparedStatement.setString(3, classmate.getLoc());
			preparedStatement.setInt(4, classmate.getId());

			// Execute Statement
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close Connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return classmate;
	}

	public void getAllClassmate() {

		Connection connection = helperClass.getConnection();
		String sql = "select * from classmate";

		try {

			// Create Statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// Execute Statement
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println("=============================================");
				System.out.println("Classmate ID    : " + resultSet.getInt(1));
				System.out.println("Classmate Name  : " + resultSet.getString(2));
				System.out.println("Classmate Email : " + resultSet.getString(3));
				System.out.println("Classmate Loc   : " + resultSet.getString(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close Connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void getByIdClassmate(int id) {

		Connection connection = helperClass.getConnection();
		String sql = "select * from classmate where id=?";

		try {

			// Create Statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);

			// Execute Statement
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println("===============================================");
				System.out.println("Classmate ID    : " + resultSet.getInt(1));
				System.out.println("Classmate Name  : " + resultSet.getString(2));
				System.out.println("Classmate Email : " + resultSet.getString(3));
				System.out.println("Classmate Loc   : " + resultSet.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close Connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
