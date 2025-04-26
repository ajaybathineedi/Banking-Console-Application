package org.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.connection.GetConnection;
import org.connection.GetConnectionInterface;
import org.customer.Customer;

public class CustomerService {
	Connection con=null;
	Customer cus=null;
	public CustomerService(Connection con,Customer cus) {
		this.con=con;
		this.cus=cus;
	}
	public CustomerService() {
		GetConnectionInterface gci=new GetConnection();
    	 this.con=gci.getConnection();
	}
	public String getAccountNumber(String aadhar) {
		String accountNumber=null;
		try {
		PreparedStatement ps=con.prepareStatement("select customer_id from customer where aadhar=?;");
		ps.setString(1,aadhar);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			accountNumber=rs.getString("customer_id");
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return accountNumber;
	}
	public int getAmount(String accountNumber)
	{
		int accNumber=Integer.parseInt(accountNumber);
		int amount=0;
		try {
			PreparedStatement ps=con.prepareStatement("select amount from customer where customer_id=?;");
			ps.setInt(1,accNumber);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				amount=rs.getInt("amount");
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return amount;
	}
	public int updateAmount(int amount,String accountNumber) {
		int i=0;
		int accNumber=Integer.parseInt(accountNumber);
		try {
			PreparedStatement ps=con.prepareStatement("update customer set amount=? where customer_id=?;");
			ps.setInt(1,amount);
			ps.setInt(2, accNumber);
			i=ps.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return i;
	}
    public void insertData() 
    {
    	try {
    		PreparedStatement ps=con.prepareStatement("insert into customer(customer_name,phone_number,email,aadhar,amount) values(?,?,?,?,?);");
    		ps.setString(1,cus.getCustomerName());
    		ps.setString(2, cus.getPhoneNumber());
    		ps.setString(3, cus.getEmail());
    		ps.setString(4, cus.getAadhar());
    		ps.setInt(5, cus.getAmount());
    		ps.executeUpdate();
    	}catch(SQLException e) {
    		System.out.println("Error while entering the data into the table");
    		e.printStackTrace();
    	}
    }
}
