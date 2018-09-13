
public class Review2 {

	public static void main(String[] args) {

		Bicycle b = new Bicycle();
		
		b.speedUp(10);
		
		b.printState();
		
	}

}

// 자전거 설계도

class Bicycle {

	int speed = 0; // 멤버변수 : 특정 값으로 초기화 하지 않으면 미리 정해진 기본값으로 자동으로 초기화

	void speedUp(int increment) { // 파라미터 변수 : 외부에서 전달받은 값
		speed = speed + increment;
	}

	void printState() {

		int mySpeed = speed; // 지역변수 : 직접 값을 할당한 후에 사용해야 한다
		System.out.printf("speed = %d", mySpeed);
	}

}