class CallStackTest {
	public static void main(String[] args) {
		// �ڵ� 1
		firstMethod();
		// �ڵ� 2
	}

	static void firstMethod() {
		// �ڵ� 3
		secondMethod();
		// �ڵ� 4
	}

	static void secondMethod() {
		//�ڵ� 5
		System.out.println("secondMethod()");
		//�ڵ� 6
	}
}
