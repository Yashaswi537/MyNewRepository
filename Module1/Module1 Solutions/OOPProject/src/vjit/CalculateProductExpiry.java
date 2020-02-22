package vjit;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class CalculateProductExpiry {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("enter the purchase date in dd/mm/yyyy format" );
        String s = sc.next();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("enter the warrantee period in mm/yyyy format" );
        String s1 = sc.next();
        
        
		LocalDate start =  LocalDate.parse(s,formatter);
		LocalDate end = LocalDate.parse(s1,formatter1);
		
		Period period = start.until(end);
		System.out.println("Days:"+ period);
	//	System.out.println("Months:"+period.getMonths());
		//System.out.println("Years:"+ period.getYears());
		sc.close();
	}
}