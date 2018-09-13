package p405;

public class BigBox {
	
	int a = 10;
	static int b = 20;
	
	public void printA() {
		System.out.println("a = " + a);
	}
	
	public static void printB() {
		System.out.println("b = " + b);
	}
	
	// inner class
	static class TinyBox{ 
		int c = 30;
		
		public void show() {
			System.out.println(b + ", " + c);
		}
		
	}
	
}

