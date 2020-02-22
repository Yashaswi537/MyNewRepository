package vjit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Person p1= new Person();
		Person p2 = new Person("manasa","nagula","934567865");
	//	System.out.println("Enter Phone number ");
	//	String phn= sc.next();
	//	p1.setPhn(phn);

		//System.out.println("Personal Details");
	//	System.out.println("-----------------");
		//System.out.println("First name:"+p1.getFname());
		//System.out.println("last name:"+p1.getLname());
		//System.out.println("Gender:"+p1.getGender());
	//	System.out.println("phn:"+p1.getPhn());
		//System.out.println("-----------------");
	      System.out.println("First name:"+p2.getFname());
	//	System.out.println("last name:"+p2.getLname());
		//System.out.println("Gender:"+p2.getPhn());
	    //System.out.println("Gender:"+p2.getGender());
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("enter the date of birth in dd/mm/yyyy format" );
        String s = sc.next();
        LocalDate start = LocalDate.parse(s,formatter);
        int age =p1.calculateAge(start);
        String f= p1.getFname();
        String l = p1.getLname();
        
        System.out.println("Full name: "+p1.getFullName(f, l) +" Age:"+age);
        sc.close();
	}

}
