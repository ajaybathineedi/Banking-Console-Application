package org.connection;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConnectionString implements ConnectionStringInterface {
	@Override
	public String getConnectionString(String filename) throws IOException{
		FileInputStream fis=new FileInputStream(filename);
		Properties prop=new Properties();
		prop.load(fis);
		String user=prop.getProperty("user");
		String password=prop.getProperty("password");
		String system=prop.getProperty("system");
		String protocal=prop.getProperty("protocal");
		String port=prop.getProperty("port");
		String database=prop.getProperty("database");
		String conString=String.format("%s//%s:%s/%s?user=%s&password=%s",protocal,system,port,database,user,password);
		return conString;
		
	}
}
