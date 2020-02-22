package vjit;

public class PersonDetails {
    String fname;
    String lname;
    String gender;
    int age;
    double weight;
    
    
	public PersonDetails(String fname, String lname, String gender, int age, double weight) {
		
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDetails pd = new PersonDetails("Divya","Bharathi","F",20,88.66);
	
		System.out.println("Personal Details");
		System.out.println("-----------------");
		System.out.println("First name:"+pd.fname);
		System.out.println("last name:"+pd.lname);
		System.out.println("Gender:"+pd.gender);
		System.out.println("age:"+pd.age);
		System.out.println("weight:"+pd.weight);
	}

}
