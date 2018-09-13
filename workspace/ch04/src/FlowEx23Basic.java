class FlowEx23Basic {
	public static void main(String[] args) {
		int i = 5;

		while (i-- != 0) { // 후처리 증감식 : 비교부터 하고 그 다음에 -1 을 수행한다
			System.out.println(i + " - I can do it.");
		}

		System.out.println();

		i = 5;

		while (--i != 0) // 전처리 증감식 : 먼저 - 1 을 수행하고 그 다음 비교한다
			System.out.println(i + "- I can do it.");

		System.out.println();

		i = 5;

		while (i != 0) { // 후처리 증감식 : 비교부터 하고 그 다음에 -1 을 수행한다
			i = i - 1;
			System.out.println(i + " - I can do it.");
		}

	} // main의 끝
}
