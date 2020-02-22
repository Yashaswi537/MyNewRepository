package vjit;

import java.util.Scanner;

public class StringOperation {
	public String add(String inp)
	{
		return inp+inp;
	}
	public String replaceOddPosition(String inp)
	{
		//String str = "";
		for(int i=0;i<inp.length();i+=2)
		{

			 inp=  inp.replace(inp.charAt(i) ,'#' );
		
		}
		return inp;
	}
	public String replaceOddUpper(String inp)
	{
		String str = "";
		//char ch;
		for(int i=0;i<inp.length();i++)
		{
			if(i%2 == 0)
			{
              
		       str = str+Character.toUpperCase(inp.charAt(i)) ;
			}
			else
			{
				str= str+inp.charAt(i);
			}
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringOperation so = new StringOperation();
	//	String str=so.add(input);
	//	System.out.println(str);
	//	String str1=so.replaceOddPosition(input);
	//	System.out.println(str1);
	  String s2=	so.replaceOddUpper(input);
		System.out.println(s2);
		sc.close();

	}

}
