package first_java_project;
import java.util.Arrays;
import java.util.HashMap;

public class Second_class {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
		
		String a = "go";
				String b = " Sagehen";
				System.out.println(a+b); // "go Sagehen"
				System.out.println( a.charAt(1) ); // "o"
				System.out.println((a+b).substring(1,4)); // "o S"
				System.out.println( (a+b).indexOf('e') ); // "6"
				String[] s = (a+b).split(" "); 
				System.out.println( Arrays.toString(s)); // "[go, Sagehen]"
				System.out.println(b.length());
				System.out.println((" "+a+b+"  ").trim());
				System.out.println("Ak".compareTo("B")); //1
				
					
	}

}
