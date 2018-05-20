package first_java_project;

public class Animal{
	String myName = "Howard";
	int myAge = 5;
	
	public Animal(String input) {
		this.myName = input;
	}
	
	public Animal() {
		this("Edward");
	}

	public void sayHello(){
		System.out.println("hello");
	}
}
