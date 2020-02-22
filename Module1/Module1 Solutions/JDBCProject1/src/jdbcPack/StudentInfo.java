package jdbcPack;
import java.sql.*;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","nani","nani1234");
			Statement stmt=con.createStatement();
			String url="select *from student";
			ResultSet rs=stmt.executeQuery(url);
			while(rs.next()){
				String subjectcode=rs.getString(1);
				String subjectname=rs.getString(2);
				String grade="";
				char res;
				int intmarks=rs.getInt(3);
				int externalmarks=rs.getInt(4);
				int total=intmarks+externalmarks;
				if(total>40){
						res='p';
						if(total>80){
							grade="o";
						}
						else if(total<80){
							grade="a";
						}
						
				}
				else{
					res='f';
				}
				System.out.println(subjectcode+"\t"+subjectname+"\t"+intmarks+"\t"+externalmarks+"\t"+total+"\t"+grade+"\t"+res);
				
			}
			
		
			stmt.close();
			rs.close();
			con.close();
		}
		catch(Exception e){
			
		}

	}

}