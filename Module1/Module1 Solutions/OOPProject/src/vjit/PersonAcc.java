package vjit;

public class PersonAcc {
	String name;
	float age;
	
	public PersonAcc(String name, float age) {
		//super();
		this.name = name;
		this.age = age;
	}
	
	public PersonAcc(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	

}
