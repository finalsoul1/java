package p482;

public class Test {

	public static void main(String[] args) {
		/*
		 * String 변수로 문자열을 조작하면 객체가 생성되므로 좋지 않습니다 문자열을 조작할 때 대신 StringBuffer,
		 * StringBuilder를 사용합니다
		 * 
		 * StringBuffer : 멀티스레드 환경에서 사용한다. 멀티스레드에서도 안전하게 수행되기 위해서 코드의 부분적인 락이 걸려있기 때문에
		 * 처리속도는 StringBuilder보다 느리다
		 * 
		 * StringBuilder : 싱글스레드 환경에서 사용한다
		 */

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 100; i++) {
			sb.append(i);
		}
		System.out.println(sb.toString());

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			stringBuilder.append(i);
		}
		System.out.println(stringBuilder.toString());
	}

}
