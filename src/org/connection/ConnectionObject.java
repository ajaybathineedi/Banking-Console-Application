package org.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionObject  implements ConnectionObjInterface{
	@Override
	public Connection getConnectionObject(String connString) {
		Connection con=null;
		try {
			con=DriverManager.getConnection(connString);
		}catch(SQLException e) {
			System.out.println("Error while establishing the connection");
			e.printStackTrace();
		}
		return con;
	}
}
