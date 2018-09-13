package inherit;

public class Test {

	public static void main(String[] args) {
		Father f = new Father();
		System.out.println(f.name);

		Child c = new Child();
		System.out.println(c.name);
	}
}
