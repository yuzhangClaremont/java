Java coding notebook

## Java Eclipse basic
in terminal
```
java --version
```

By default in Eclipse you only have to press Ctrl-space for autocomplete. Then select the desired method and wait 500ms for the javadoc info to pop up. If this doesn't work go to the Eclipse Windows menu -> Preferences -> Java -> Editor -> Content assist and check your settings here auto fill java keyword
fn + shift+cmd+f11  run shortcut

## Java project and class
File - new java prject - next - finish
project name - new class

rename java class: right click class, Refactor- Rename

## Java statement

#### symbols
&& and || or

#### Loops

while loop

```
		// java loop
		int count = 0;
		while (count < 5) {
			System.out.println(count);
			count ++;
		}
```

while loop text in the end
```
	do{
		System.out.println(i);
		i++;
	}while(i<5);
```

for loop
```
		int[] myList = {2,3,5,8};
		myList[1] = 10;
		for (int i: myList) {
			System.out.println(i);
		}
	}
```

```
    for (int i = 0; i<5; i++) {
        System.out.println(i);
    }
```

if ... else if ... else statement
```
		if (Gender == false && PI == 3.141){
			int compound_num = 10;
			System.out.println("inner part");
		}
		else if (Gender == true) {
			System.out.println("this is a girl");
		}
		else {
			System.out.println("this is a boy");
		}
```

switch statement: multiple choose one
```
		String s = "this is a testing string \\ it\'s fun";
		switch (s) {
		case "this!":
			System.out.println("this");
			break;
		case "is a testing string!!":
			System.out.println("testing str");
			break;
		case "this is a testing string \\ it\'s fun":
			System.out.println(s);
			break; 
		
        default:
			System.out.println("the case not cover the string");
		}
```
**"\\\\" will print \, "\\'" will print '**
..* __with break: only print s; without break   without break: print s and default__
..* break will jump out of loop
..* continue will skip following move to next step of loop


## Class (Object)

### Constructor
```
public class List {
	private ListNode myHead;
	private int mySize;
	
	// List constructor
	public List() {
		myHead = null;
		mySize = 0;
	}
	private class ListNode{
		private String myData;
		private ListNode myNext;
		
		// new born constructor
		private ListNode(String data, ListNode next) {
			myData = data;
			myNext = next;
		}
		
		//inheirate constructor
		private ListNode(String data) {
			this(data,null); // use this to construct
		}
	}
}
```
when no constructor written, we have default constructor

```
Cat myCat = new Cat();
```

Use this() to define a constructor from another constructor
```
	public Animal(String input) {
		this.myName = input;
	}
	
	public Animal() {
		this("Edward");
	}
```

Use super() to define a constructor from a superclass constructor
```
	public Animal(String input) {
		this.myName = input;
	}
```
```
	public Dog() {
		super("Snoopy");
	}
```

### variable

public variable: can get access by any classes
protected variable: can get access by classes in same folder
```
int i = 10;
```
private variable: can only be used in current class

constant variable: can't be redefined
```
final boolean Bool = true;
```

static variable: belongs to class, not variable. can be used in different class as classname.staticVariableName
```
public class Example {
    static int i = 10;
}

public static void main(String[] args){
	Dog.i++; // static variable can be modified
}
```

### functions

public function: method can be used in different classes?
static funtion: can only use static variables, static function is called on class, not an object method
static method can not use this to call another method
```
	public static double parameter(double radius) {
		return 2*PI*radius;
	}

	Dog d1 = new Dog(10);
	d1.getOlder(); // object method
	Dog.printDog();  // static function
```

indefinite length parameter function
```
	public static int add(int...a) {
		int s = 0;
		for (int i = 0; i< a.length; i++) {
			s += a[i];
		}
		return s;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(add(1,2,3,1));
	}
```

### Inheritance
Dog is a subclass of Animal, Animal is a superclass of Dog

subclass can extend superclass, inherit instance variables, and update methods or instance variable
```
public class Animal{
	String myName = "Howard";
	int myAge = 5;

	public void sayHello(){
		System.out.println("hello");
	}
}
```
```
public class Dog extends Animal {
	String Color;
	int myAge = 1;
	
	public Dog(String dogColor, int dogAge) {
		this.Color = dogColor;
		this.myAge = dogAge;
	}
	
	public void sayHello() {
		System.out.println("I am a dog woof");
	}
```
child class can get access of superclass instance variable, methods and override them iff they are public!

Static type: the reference
Dynamic type: type of object
to declare children array at once
cast static type to a subclass
```
Animal a1 = new Animal(); // a1 static type: Animal, Dynamic type: Animal
Animal a2 = new Dog();//a2 static type: Animal, Dynamic type: Dog
Animal[] pets = new Animal[4];
pets[0] = new Animal();
pets[1] = new Dog();// 
pets[1].bark();// use static type to find method, animal don't has bark()
((Dog) pets[1]).bark();// casting to Dog can bark
```

When calling method from another method, we use this
when calling method from parent class, we use super
```
public void printSomeStuff(){
	this.printBark();
	super.parentPrint();
}
```

### Interface 
what if you want to build a array of objects from different parents, but share same funtionality like is ridable? we can build a ridable interface:
```
public interface Ridable {
	public void turnLeft();
	public void turnRight();
	public void goStraight();
}
```
```
public class Horse extends Animal implements Ridable {
	public void turnLeft() {
		System.out.println("go left");
	}
	public void turnRight() {
		System.out.println("go right");
	}
	public void goStraight() {
		System.out.println("go straight");
	}
	
	public static void main(String[] args) {
		Ridable[] viecles = new Ridable[2];
		viecles[0] = new Horse();
		viecles[1] = new Car();
	}
}
```

### Wrapper class
```
Integer Num = new Integer(7);
Integer Num_s = new Integer("7");
int i = Num.intValue();
short ss = Num.shortValue();
Num.compareTo(Num_s);
```
### inner class
inner class can use any out class instance variables and methods, even when they are private
to construct new inner class
```
OuterClass out =  new OuterClass();
InnerClass in = out.new InnerClass();

this.function();//use inner class function
OuterClass.this.function();// use outerclass function
```

## Java type

### Strings

String a = "go"
String b = " Sagehen"
System.out.println(a **+** b); // "go Sagehen"
System.out.println( a.**charAt**(1) ); // "o"
System.out.println( (a+b).**substring**(1,4) ); // "o S"
String[] s = (a+b).**split**(" ");//only use tring 
System.out.println( Arrays.toString(s)); // "[go, Sagehen]"
System.out.println((" "+a+b+"  ").**trim**()); // remove whitespace in the head and end 
int arrayLength = b.length(); //8
System.out.println("Ak".compareTo("B")); //1
System.out.println("go Sagehen".replace("e","E"));// go SagEhEn

### Integer
wrapper class
change string to int
```
int i = Integer.parseInt("12");
```



## data structure

#### Array
```
int[] myList = {2,3,5,8};
myList[1] = 10;
//myList = [2,10,5,8]

int[] defaultArray = new int[4];
// defaultArray = [0,0,0,0]
int arrayLength =  defaultArray.length; //4

```

two dimension array
```
int[][] twoD; // first declare 2-d array
twoD = int[2][4]; // initialize it as 2 x 4 array of 0
int[][] twoD = {{1,2},{1},{2,3,4}};
System.out.println(Arrays.toString(twoD));
```

Array sorts and binary search O(logn)
```
import java.util.Arrays;
int[] Array = {2,6,1,3,12,-1,0};
Arrays.sort(Array);
System.out.println(Arrays.toString(Array));
int index = Arrays.binarySearch(Array, 3);
System.out.println(index);
```

** transfer array to string, only string can be printed**
```
import java.util.Arrays;
System.out.println(Arrays.toString(myList));
//[2,10,5,8]
```

#### LinkedList
```
import java.util.LinkedList;

LinkedList<String> myList = new LinkedList<String>();
myList.add("1");
myList.addFrist("0");
myList.addLast("2");
```

toString function must be public
```
	public String toString() {
		String res = "(";
		for (ListNode iter = myHead; iter != null; iter = iter.myNext) {
			res += (iter.myData +")-(");
		}
		res +=")";
		return res;
	}
```

#### HashMap
https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html
```
import java.util.HashMap;

HashMap<Integer, String> facebook =  new HashMap<Integer, String>();
// only hash object, can't use int primitive type
facebook.put(1, "Yun");
facebook.put(2,"Ling");

System.out.println(facebook.get(1)); // return Yun
System.out.println(facebook.get("Ling")); // null, only use key to get value
```
..*only hash object, can't use int primitive type.
..*only use key to get value

####
Stack Lifo
https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html
```
import java.util.*

		Stack<String> s = new Stack<String>();
		s.push("1");
		s.push("2");
		s.pop();// pop 2
		System.out.println(s); //[1]
```
Queue Fifo
Queue is a interface in java, we can't give it as a dynamic type, thus we use priorityQue to instantiate queue
https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html
```
		Queue<String> q = new PriorityQueue<String>();
		q.add("1");
		q.add("2");
		q.remove();
		System.out.println(q);
```

## Java library

### Math
no import needed
```
	System.out.println(Math.rint(2.51));// 3.0
	System.out.println(Math.floor(2.51));//2.0
	System.out.println(Math.abs(-2.1));
	System.out.println(Math.random());// random number between [0, 1[
```

### Random
```
import java.util.Random;
System.out.println(r.nextInt(4));// random Integer from 0 to 4
System.out.println(r.nextInt());
```

## Error cache

```
try{   							// possible error part
	int i = Integer.parseInt("12L");
	System.out.println(i);
}catch (Exception e) {  		// if error exist do this
	e.printStackTrace();
}finally { 						// always do finnaly no matter what
	System.out.println("ending");
}
System.out.println(add(1,2,3,1));
```