package first_java_project;
import java.util.*;
//import java.math.*;
import java.util.HashMap;
import java.util.Random;

public class Second_class {
	
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
		Scanner input = new Scanner(System.in);
		boolean error = true;
		do {
			try{
				System.out.println("input a num");
				String s = input.nextLine();
				int i = Integer.parseInt(s);
				System.out.println(i);     // error encountered
				error = false;
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("try it again");
			}finally {
				System.out.println("finished");
				
			}
		}while (error == true);
		input.close();
		System.out.println(add(1,2,3,1));

		
//		Random r = new Random();
//		System.out.println(r.nextInt(4));
//		System.out.println(First_class.PI);
//		System.out.println(First_class.perimeter(3));
		
//		int[] listArray = {0,1,2,3};
//		listArray[1] = 10;
//		
//		int[] defaultArray = new int[4];
//		System.out.println(Arrays.toString(defaultArray));
//		
//		HashMap<Integer, String> facebook =  new HashMap<Integer, String>();
//		facebook.put(1, "Yun");
//		facebook.put(2,"Ling");
//		
//		System.out.println(facebook.get(1));
//		System.out.println(facebook.get("Ling"));
		
//		String a = "go";
//				String b = " Sagehen";
//				System.out.println(a+b); // "go Sagehen"
//				System.out.println( a.charAt(1) ); // "o"
//				System.out.println((a+b).substring(1,4)); // "o S"
//				System.out.println( (a+b).indexOf('e') ); // "6"
//				String[] s = (a+b).split(" "); 
//				System.out.println( Arrays.toString(s)); // "[go, Sagehen]"
//				System.out.println(b.length());
//				System.out.println((" "+a+b+"  ").trim());
//				System.out.println("Ak".compareTo("B")); //1
				
//				System.out.println(Math.random());
					
	}

}
