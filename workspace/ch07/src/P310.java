import java.util.Random;

public class P310 {

	public static void main(String[] args) {
//		Random r = new Random();
//		System.out.println(r.nextInt(45));

		MyRandom rnd = new MyRandom();
		System.out.println(rnd.nextInt(45));
	}

}

class MyRandom extends Random{

}