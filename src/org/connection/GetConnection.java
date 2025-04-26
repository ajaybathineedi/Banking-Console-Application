package org.connection;
import java.io.IOException;
import java.sql.*;
public class GetConnection implements GetConnectionInterface {
	@Override
	public  Connection getConnection() {
		Connection con=null;
    	ConnectionStringInterface csi=new ConnectionString();
    	ConnectionObjInterface coi=new ConnectionObject();
    	try {
    	 con=coi.getConnectionObject(csi.getConnectionString("db.properties"));
    	}catch(IOException e) {
    		System.out.println("error while getting connection string");
    	}
    	return con;
	}

}
