package jdbcPack;
import java.io.*;
import java.sql.*;

public class JdbcPrepared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			char ch='y';
		
			PreparedStatement pst = null;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@localhost:1521:XE";
			Connection con  =DriverManager.getConnection(url,"sys as sysdba","root");
			while(ch=='y'||ch=='Y')
			{
				pst = con.prepareStatement("Insert into student values(?,?,?,?,?)");
				System.out.println("Enter Roll");
				int r = Integer.parseInt(br.readLine());
				System.out.println("Enter Name");
				String nm = br.readLine();
				System.out.println("DOb");
				String db = br.readLine();
				System.out.println("address");
				String ad = br.readLine();
				pst.setInt(1, r);
				pst.setString(2, nm);
				pst.setString(3, db);
				pst.setString(4, ad);
				pst.executeUpdate();
				System.out.println("Record inserted");
				System.out.println("Do want to cont....(y/n)");
				ch =(char)br.read();
				
			}
			
			Statement stmt = con.createStatement();
			String query ="select *from student";
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("Roll\tName\t\tDob\t\tAddress\n");
			while(rs.next())
			{
				System.out.println("");
			}
			stmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
			
			
			
		}
	}

}
