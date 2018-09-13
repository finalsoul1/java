package p465;

public class Test2 {
	public static void main(String[] args) {
		Subclass s1 = new Subclass();
		s1.foo();
		
		Super s = new Subclass();
		s.foo();
	}
}

class Super{
	private void foo() {
		System.out.println("Super");
	}
}

class Subclass extends Super{
	public void foo() {
		System.out.println("Subclass");
	}
}