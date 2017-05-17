package com.infotech.client;

import java.sql.Connection;

import com.infotech.util.DBUtil;

public class ClientTest {

	public static void main(String[] args) {

		Connection connection = DBUtil.getConnection();
		if(connection != null)
			System.out.println("JDBC:connection is taken..");
	}

}
