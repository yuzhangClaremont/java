package first_java_project;
import java.util.Arrays;

public class Dog extends Animal {
	String Color;
//	int myAge;
	
//	public Dog(String dogColor, int dogAge) {
//		this.Color = dogColor;
//		this.myAge = dogAge;
//	}
	
	public void sayHello() {
		System.out.println("I am a dog woof");
	}
	
	public Dog() {
		super("Snoopy");
	}
	
	public void bark() {
		System.out.println("woof");
	}
	
	public static void main(String[] args) {
		Dog myDog =  new Dog();
		
		Animal a1 = new Animal(); // a1 static type: Animal, Dynamic type: Animal
		Animal a2 = new Dog();//a2 static type: Animal, Dynamic type: Dog
		Animal[] pets = new Animal[4];
		pets[0] = new Animal();
		pets[1] = new Dog();// 
//		pets[1].bark();// use static type to find method, animal don't has bark()
		((Dog) pets[1]).bark();// casting to Dog can bark
		int i = 10;
		double d = (double) i;
//		pets[2] = new DogChildren();
		
//		System.out.println(myDog.Color);
//		String s;
//		s =  "go Sagehen";
//		s.replace("e","E");
//		System.out.println("go Sagehen".replace("e","E"));
//		
//		int[][] twoD = {{1,2},{1},{2,3,4}};
//		System.out.println(Arrays.toString(twoD));
//		
//		int[] Array = {2,6,1,3,12,-1,0};
//		Arrays.sort(Array);
//		System.out.println(Arrays.toString(Array));
//		int index = Arrays.binarySearch(Array, 3);
		System.out.println(myDog.myAge);
		myDog.sayHello();
		
		
	}
}
