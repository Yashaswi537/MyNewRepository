package vjit;

import java.time.*;

public class Person {
	    String fname;
	    String lname;
	    char gender;
	    String phn;
	    
	    enum gender {F,M};
	    
	    public Person() {
		fname="dimple";
		lname ="tiwari";
		//gender ='F';
	//	phn ="0000000000";
		}

       public Person(String fname, String lname,String phn) {
			this.fname = fname;
			this.lname = lname;
			//this.gender = gender;
			//this.phn = phn;
		}

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

	public String getPhn() {
		return phn;
	}

	public void setPhn(String phn) {
		this.phn = phn;
	}
	 public int calculateAge(LocalDate d)
	   {
	       LocalDate end = LocalDate.now();
			
			Period period = d.until(end);
		    return  period.getYears();
	   }    
	public String getFullName(String f , String l)
	{
		
		return f.concat(l);
	}
}
