Java coding notebook

### Java basic
in terminal
```
java --version
```

ctrl+alt+/ auto fill java keyword

### Java project and class
File - new java prject - next - finish
project name - new class

rename java class: right click class, Refactor- Rename

### Java statement

##### symbols
&& and || or

##### Loops

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
**\\ will print \, \' will print '**
*with break: only print s; without break   without break: print s and default*
*break will jump out of loop*

static public function: method can be used in different classes?
static funtion can only use static variables
```
	public static double parameter(double radius) {
		return 2*PI*radius;
	}
```

### variables

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


### data structure
```
		int[] myList = {2,3,5,8};
		myList[1] = 10;
```