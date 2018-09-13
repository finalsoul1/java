final class Card3 {
	String kind;
	int num;

	Card3() {
		this("SPADE", 1);
	}

	Card3(String kind, int num) {
		this.kind = kind;
		this.num  = num;
	}

	public String toString() {
		return kind + ":" + num;
	}
}

class ClassEx1 {
	public static void main(String[] args) throws Exception {
		Card3 c  = new Card3("HEART", 3);       // new�����ڷ� ��ü ����
		
		/* <> : ���׸�
		 * Class<? extends Card3> java.lang.Object.getClass()
		 * Class<����ϴ��ڷ���>
		 * Class ���赵�� ���� ��ü�ε� �� ��ü�� Card3.class�� ���õ� ��� ������ ����ϰų� �Ǵ�
		 * �� �ڽ�(extends) ��ü�� �߿� �ϳ�(?)�� �� �ִ�
		 */
		Class<? extends Card3> cObj = c.getClass();

		Card3 c2 = Card3.class.newInstance();   // Class��ü�� ���ؼ� ��ü ����
		// Card3 c2 = new Card3(); ����
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());		
	}
}
