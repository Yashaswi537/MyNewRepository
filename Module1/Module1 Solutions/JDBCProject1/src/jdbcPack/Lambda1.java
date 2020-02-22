package jdbcPack;

public class Lambda1 {


public static void main(String args[])

{
	Lambda1 tester= new Lambda1();

MathOperation addition = (int a , int b)->a+b;
MathOperation subraction = (int a , int b)->a-b;
MathOperation multiplication = (int a , int b)->{return a* b;};
MathOperation division = (int a , int b)->a/b;
System.out.println("10+5 ="+tester.operate(10,5,addition));
System.out.println("10-5 ="+tester.operate(10,5,subraction));
System.out.println("10*5 ="+tester.operate(10,5,multiplication));
System.out.println("10/5 ="+tester.operate(10,5,division));
GreetingService greetService1= message -> System.out.println("Hello" + message);
GreetingService greetService2= message -> System.out.println("Hello" + message);
		
		greetService1.sayMessage("Venu");
greetService2.sayMessage("nani");
}
interface MathOperation{
	int operation(int a,int b);
}
interface GreetingService{
	void sayMessage(String message);
}
private int operate(int a,int b, MathOperation mathOperation)
{
	return mathOperation.operation(a,b);
}
}