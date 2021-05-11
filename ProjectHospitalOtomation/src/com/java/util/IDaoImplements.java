package com.java.util;

import java.sql.Connection;
import java.util.ArrayList;

public interface IDaoImplements<AdminDto> {
	// CRUD
	void create(T t) {
		String sql = "insert admin(user_name,email_address,password) values(?,?,?)";
		PreparedStatement preparedStatement = connection.preparedStatement(sql);
		preparedStatement.setString(1, adminDto.getUserName());
		preparedStatement.setString(2, adminDto.getEmailAddress());
		preparedStatement.setString(3, adminDto.getPassword());
		
		int result = preparedStatement.executeUpdate();
		if(result>0) {
			System.out.println("successful");
		}
		else {
			System.out.println("unsuccessful");
		}
	};

	void update(T t);

	void delete(long id);

	ArrayList<T> list();

	// method with body
	default Connection getIntefaceConnection() {
		SingletonDbConnection singleDB = new SingletonDbConnection();

		return singleDB.connectionMethod();
	};
}
