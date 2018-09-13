class CallStackTest {
	public static void main(String[] args) {
		// 内靛 1
		firstMethod();
		// 内靛 2
	}

	static void firstMethod() {
		// 内靛 3
		secondMethod();
		// 内靛 4
	}

	static void secondMethod() {
		//内靛 5
		System.out.println("secondMethod()");
		//内靛 6
	}
}
