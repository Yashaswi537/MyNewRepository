/*package vjit;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class CalculateDuration {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("enter the date in dd/mm/yyyy format" );
        String s = sc.next();
		LocalDate start =  LocalDate.parse(s,formatter);
		LocalDate end = LocalDate.now();
		
		Period period = start.until(end);
		System.out.println("Days:"+ period.getDays());
		System.out.println("Months:"+period.getMonths());
		System.out.println("Years:"+ period.getYears());
	}

}*/
package vjit;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class CalculateDuration {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("enter the first date in dd/mm/yyyy format" );
        String s = sc.next();
        System.out.println("enter the second date in dd/mm/yyyy format" );
        String s1 = sc.next();
        
        
		LocalDate start =  LocalDate.parse(s,formatter);
		LocalDate end = LocalDate.parse(s1,formatter);
		
		Period period = start.until(end);
		System.out.println("Days:"+ period.getDays());
		System.out.println("Months:"+period.getMonths());
		System.out.println("Years:"+ period.getYears());
		sc.close();
	}
}
