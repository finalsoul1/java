package quiz;

public class Mission {

	public static void main(String[] args) {

		SnowMan snow = new SnowMan();
		
	    String name = snow.name;
		
		System.out.println("���� �̸��� "+ name);
		
		snow.forward();
		snow.forward();
		snow.turnRight();
		snow.kick();
		snow.forward();
		snow.forward();
		snow.turnLeft();
		snow.forward();
		
	}

}
