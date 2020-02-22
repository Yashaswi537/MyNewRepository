package vjit;

import java.util.Arrays;
import java.util.Scanner;

public class StringCheck {
	 public String checking(String inp)
	 {
		 //int n = inp.length();
		 char a[] = inp.toCharArray();
		 Arrays.sort(a);
		 return new String(a);	 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringCheck sc1 =new StringCheck();
		String inp = sc.next();
	  String output = sc1.checking(inp);
	  if(inp.equals(output))
	  {
		  System.out.println("Positive String");
	  }
	  else
	  {
		  System.out.println("Negative String");
	  }
	  sc.close();
	}
}
