package quiz2;

public class Mission {

	public static void main(String[] args) {

		SnowMan man = new SnowMan();
		
		for (int i = 0; i < 4; i++) {
			man.forward();
			man.forward();
			man.turnLeft();
		}
	}
}
