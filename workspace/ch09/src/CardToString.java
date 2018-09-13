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
	 * 슈퍼클래스의 toString() 메소드를 그대로 사용하면
	 * Card@33909752 형태의 문자열을 리턴한다.
	 * 
	 * toString() 메소드를 재정의해서 객체가 가진 멤버변수의 값을
	 * 출력하는 용도로 바꾸어 사용할 수 있다
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
