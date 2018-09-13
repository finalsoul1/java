package exer;

public class E6_3 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "È«±æµ¿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("ÀÌ¸§ : "+ s.name);
		System.out.println("ÃÑÁ¡ : "+ s.getTotal());
		System.out.println("Æò±Õ : "+ s.getAverage());
	}

}

class Student1 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		int num = kor + eng + math;
		return num;
	}
	
	float getAverage() {
		float avg = (int)((getTotal() / 3f) * 10 + 0.5f) / 10f;
		
		return avg;
	}
}