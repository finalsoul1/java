package bird2;

public class App {

	public static void main(String[] args) {
		
		int i = 0;
		
		AngryBird bird = new AngryBird();
		BadPig pig = new BadPig();
		
		
		bird.forward();
		bird.forward();
		bird.forward();
		bird.forward();
		
		bird.turnLeft();
		
		while(i<5) {
			bird.forward();
			i++;
		}
		
		pig.sound();
		
		long regNo = 8888888888888L;
		System.out.println(regNo);
		
		System.out.println(true);
		System.out.println("A"+"B");
	}
	
}
