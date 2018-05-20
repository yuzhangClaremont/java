package first_java_project;

public class First_class {
	static final double PI = 3.14;
	static final boolean Gender = true;
	
//	Gender = false;
	/*
	 *  a function to return the circumference of a circle given radius
	 */
	public static double perimeter(double radius) {
		return 2*PI*radius;
	}
	
	
	public static void main(String[] args) {
		System.out.println("hello world");
		
		// java loop
//		int count = 0;
//		while (count < 5) {
//			System.out.println(count);
//			count ++;
//		}
		
		// data structure
		int[] myList = {2,3,5,8};
		myList[1] = 10;
		for (int i = 0; i<5; i++) {
			System.out.println(i);
		}
		
		double perimeter = perimeter(3);
//		System.out.println(perimeter);
//		if (Gender == false && PI == 3.141){
//			int compound_num = 10;
//			System.out.println("inner part");
//		}
//		else if (Gender == true) {
//			System.out.println("this is a girl");
//		}
//		else {
//			System.out.println("this is a boy");
//		}									
//		System.out.print(compound_num);
		
//		String s = "this is a testing string \\ it\'s fun";
//		switch (s) {
//		case "this!":
//			System.out.println("this");
//			break;
//		case "is a testing string!!":
//			System.out.println("testing str");
//			break;
//		case "this is a testing string \\ it\'s fun":
//			System.out.println(s);
//			break;
//		default:
//			System.out.println("the case not cover the string");
//		}

//	int i = 0;
//	do{
//		System.out.println(i);
//		i++;
//	}while(i<5);
//	
	}
}
	

