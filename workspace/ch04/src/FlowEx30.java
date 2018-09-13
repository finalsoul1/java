class FlowEx30 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		while (true) {
			if (sum > 100)
				break; // 가장 가까운 반복문을 탈출
			++i; // i = i + 1
			sum += i;
		} // end of while

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);

		// 1, 2, 3, ..... 100까지의 정수중에 홀수의 합을 출력하시오

		sum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("for 홀수의 합 : " + sum);

		i = 1;
		sum = 0;
		while(i<=100) {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("while 홀수의 합 : " + sum);
		
		// 1, 2, 3, .... 100까지의 정수중에 3의 배수의 개수가 몇개인지 출력하시오
		
		int count = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) { // 3으로 나누면 나머지가 0, 1, 2만 나온다
				count++;
			}
		}
		System.out.println("for 3의배수의 개수 : " + count);
		
		i = 1;
		count = 0;
		while(i<=100) {
			if (i % 3 == 0) {
				count++;
			}
			i++;
		}
		System.out.println("while 3의배수의 개수 : " + count);
	}
}
