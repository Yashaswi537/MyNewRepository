package vjit;

public class ExceptionDemo1 {
   String fname;
   String lname;
   char gender;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
public ExceptionDemo1(String fname, String lname, char gender) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.gender = gender;
}
public void check(ExceptionDemo1 p)
{
	try
	{
		if((p.getFname()==null && p.getLname()==null) || p.getFname()==null || p.getLname()==null )
		{
			throw new MyException("Enter correct name");
		}
		else
		{
			 System.out.println(p.getFname()+p.getLname());
		}
	}
	catch(MyException e)
	{
		System.out.println("Name not entered");
		System.out.println(e);
	}
}

   public static void main(String args[])
   {
	   ExceptionDemo1 p = new ExceptionDemo1(null,"tiwari",'f');
	   ExceptionDemo1 p2=new ExceptionDemo1( null,null ,'F');
	   ExceptionDemo1 p1=new ExceptionDemo1( "dimple","tiwari" ,'F');
	   p1.check(p1);
	   p2.check(p2);
	   p.check(p);
	  
	   
	   
   }
   

}
