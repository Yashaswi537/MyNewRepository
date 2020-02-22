package jdbcPack;

import java.sql.*;
import java.util.*;

public class DBDemo1 
{
	public static void main(String args[]) throws Exception
	{
		String url ="jdbc:oracle:thin:@localhost:1521:XE";
		Properties p = new Properties();
		p.put("user", "system");
		p.put("password", "root");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =DriverManager.getConnection(url,p);
		con.setAutoCommit(false);
		//Statement stm= 
		
		System.out.println("connection established");
		con.close();
	}

}
