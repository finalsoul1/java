package p436;

import java.util.Scanner; // 풀패스를 줄여쓰자
// import java.lang.System; 
// java.lang 밑에 클래스들은 너무나 중요하고 언제나 사용하기 때문에
// 임포트 구문을 생략해도 임포트 선언이 된 것으로 인정한다


public class Test {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			System.out.print("input: ");
			
			String input = scan.nextLine();
			System.out.println(input);
			
//			scan.close(); // try() : 자동 자원 반납으로 생략이 가능하다
		} catch (Exception e) {
			
		}
		
	}
}
