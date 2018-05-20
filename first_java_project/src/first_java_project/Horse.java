package first_java_project;

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
//		viecles[1] = new Car();
	}
}
