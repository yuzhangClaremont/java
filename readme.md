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
**"\\" will print \, "\'" will print '**
__with break: only print s; without break   without break: print s and default__
*break will jump out of loop*
..*continue will skip following move to next step of loop


static public function: method can be used in different classes?
static funtion can only use static variables
```
	public static double parameter(double radius) {
		return 2*PI*radius;
	}
```

## variables

constant variable: can't be redefined
```
final boolean Bool = true;
```

static variable: can be used in different class as classname.staticVariableName
```
public class Example {
    static int i = 10;
}
```

## Java type

### Strings

String a = "go"
String b = " Sagehen"
System.out.println(a**+**b); // "go Sagehen"
System.out.println( a.**charAt**(1) ); // "o"
System.out.println( (a+b).**substring**(1,4) ); // "o S"
String[] s = (a+b).**split**(" ");//only use tring 
System.out.println( Arrays.toString(s)); // "[go, Sagehen]"
System.out.println((" "+a+b+"  ").**trim**()); // remove whitespace in the head and end 
int arrayLength = b.length(); //8



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

** transfer array to string, only string can be printed**
```
import java.util.Arrays;
System.out.println(Arrays.toString(myList));
//[2,10,5,8]
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