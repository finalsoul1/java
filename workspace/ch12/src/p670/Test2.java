package p670;

public class Test2 {
	public static void main(String[] args) {
		Calculator2<Integer> calc = new Calculator2<Integer>();
		System.out.println(calc.add(2, 3));
		
		System.out.println(new Calculator2<Double>().add(2.0, 3.0));
		System.out.println(new Calculator2<Float>().add(2F, 3.0F));
	}
}

// (Type) : ����ϴ� �ڷ����� ����ڰ� �����ؾ� �Ѵ�
// ���׸��� static�� �ȵ�. main�޼ҵ庸�� ���� �޸𸮿� �ö󰡱� ������
class Calculator2<T> {
	public T add(T a, T b) {
		return a;
	}
//	public static double add(double a, int b) {
//		return a + b;
//	}
//	public static float add(int a, float b) {
//		return a + b;
//	}
}