class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}

	/*
	 * ����Ŭ������ toString() �޼ҵ带 �״�� ����ϸ�
	 * Card@33909752 ������ ���ڿ��� �����Ѵ�.
	 * 
	 * toString() �޼ҵ带 �������ؼ� ��ü�� ���� ��������� ����
	 * ����ϴ� �뵵�� �ٲپ� ����� �� �ִ�
	 * Card [kind=SPADE, number=1]
	 */
	
}

class CardToString {
	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println(c1.kind + ", " + c1.number);

		Card c2 = new Card();
		System.out.println(c2.kind + ", " + c2.number);

		System.out.println(c1);
//		System.out.println(c1.toString());
		
		System.out.println(c2);
//		System.out.println(c2.toString());
	}
}
