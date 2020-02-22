package jdbcPack;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.*;

public class CallableDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url ="jdbc:oracle:thin:@localhost:1521:XE";
		Connection con  =DriverManager.getConnection(url,"sys as sysdba","dimple");
		CallableStatement calstat = con.prepareCall("{call empproc1(?,?,?)}");
		calstat.setInt(1,(Integer.parseInt(args[0])) );
		calstat.setString(2, args[1]);
		calstat.setDouble(3, (Double.parseDouble(args[2])));
		//calstat.setString(4,args[3]);
		ResultSet rs = calstat.executeQuery();
		calstat.close();
		System.out.println("Your data has been inserted");
		

	}

}
