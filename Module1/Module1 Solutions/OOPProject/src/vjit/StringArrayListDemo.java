package vjit;

import java.util.ArrayList;
import java.util.Collections;

public class StringArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("dimple");
		al.add("manasa");
		al.add("product15");
		al.add("product10");
		al.add("e");
		Collections.sort(al);
		//System.out.println(al);
		
		 for (String i : al) 
	            System.out.println(i);
		

	}

}
