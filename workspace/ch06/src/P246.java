import java.util.Scanner;

// package ~~~ 
// import ~~~

// 변수의 위치에 따라 구분

// 자바는 모든 코드가 범위연산자 안에 기술되어야 한다 (import, package 예외)
// int a = 10; if(true) {}

public class P246 {

	int a = 10; // 멤버변수, 필드변수, 인스턴스변수, 멤버변수는 자료형에 따라 기본값으로 자동 할당
//	int a = 20; // 멤버변수 재 선언 불가
	
	static int b = 20; // 클래스변수, static 변수, 공유변수, 전역변수
// 	static int b = 20; // 클래스변수 재 선언 불가
	
	// 조건문, 반복문 등을 클래스 바로 밑에 배치할 수 없다
//	if(true) {}
	
	void print(int x)) { // 파라미터변수 : 지역변수의 일종 (메소드 범위는 범위연산자 + 파라미터변수)
		// 단, x 변수의 값 할당은 메소드 호출 시 자동으로 이루어진다
		
		int a = 10; // 지역변수 (멤버변수와 지역변수는 아예 다른 개념이라 같은 이름으로 선언할 수 있다)
		// 지역변수는 사용하기 전 반드시 값을 할당하고 사용해야 한다
//		int a = 20; // 지역변수 재 선언 불가
		
		int c = 100;
		
		if (true) {
//			int c = 100;
			int d = 90; // 반복문이나 조건문 안에서 '선언'한 변수는 그 안에서만 쓸 수 있음
			System.out.println(d);
		}
//		System.out.println(d);
		int d = 80; // 밖에서 다시 선언 가능
		System.out.println(d);
	}
	
}

// 메소드는 클래스 안에 기술되어야 한다
//void print() {
//
//}