package org.connection;

import java.sql.Connection;

public interface ConnectionObjInterface {
	public Connection getConnectionObject(String connString);
}
