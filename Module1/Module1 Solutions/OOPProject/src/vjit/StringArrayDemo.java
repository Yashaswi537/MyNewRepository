package vjit;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n= sc.nextInt();
		String arr[] = new String[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextLine();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
			sc.close();
	}
	

}
