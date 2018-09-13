package quiz3;

import java.util.Scanner;

public class Rabbit {

	// 멤버변수
	String name = "천사";

	// 멤버메소드
	void forward() {
		System.out.println("앞으로 한칸");
	}

	void turnLeft() {
		System.out.println("왼쪽으로 돌아");
	}

	void turnRight() {
		System.out.println("오른쪽으로 돌아");
	}

	void flaThrow() {
		System.out.println("꽃던져");
	}
	
	private static int getValueFromUser() {

		System.out.print("숫자를 입력하세요.(예:12345)>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		return Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환

	}

	// 프로그램 시작하기
	public static void main(String[] args) {
		// 미션수행 : 반복문 쓰기
		
		Rabbit rabbit = new Rabbit();
		
		System.out.println("그녀는 " + rabbit.name);
		
		int num=getValueFromUser();

		
	}
}
