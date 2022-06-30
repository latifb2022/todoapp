package com.lbenzzine.todoapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lbenzzine.todoapp.model.Creds;
import com.lbenzzine.todoapp.utils.DBUtils;

public class LoginDAOImpl  implements ILoginDAO{

	@Override
	public boolean validate(Creds creds) throws ClassNotFoundException {
		boolean status = false;

		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DBUtils.getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection
						.prepareStatement("select * from users where username = ? and password = ? ")) {
			preparedStatement.setString(1, creds.getUsername());
			preparedStatement.setString(2, creds.getPassword());

			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			status = rs.next();

		} catch (SQLException e) {
			// process sql exception
			DBUtils.printSQLException(e);
		}
		return status;
	}
}
