package jdbcPack;
import java.sql.*;

public class SampleJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "sys as sysdba", "dimple");
			Statement stmt = con.createStatement();
			String sql = "select *from employe";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("Employee details");
			while(rs.next())
			{
				int empId = rs.getInt(1);
				String empName = rs.getString(2);
				float empSal = rs.getFloat(3);
				Date empDoj = rs.getDate(4);
				System.out.println(empId+ "  "+empName +" "+empSal+" "+ empDoj);
			}
			stmt.close();
			rs.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
