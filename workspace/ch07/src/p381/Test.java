package p381;

// Test use Lotto. Test Ŭ������ Lotto �������̽� ������ü�� ����Ѵ�
// Test depend on Lotto. �ٸ����� ǥ���ϸ� Test Ŭ������ Lotto �������̽� ������ü�� �����Ѵٰ� �� �� �ִ�
// Test Ŭ������ ��������� ���� �ֵ��� �ϴ� ���� �Ϲ����̴�
public class Test {
	// �������̽� ������ü�� ��ĳ�����ؼ� �������̽� �ڷ������� ��Ī�� �� �ִ�
	// �̴� ���� lotto�� ����Ű�� ��ü�� Lotto �������̽��� �����ϴ� �߻�޼ҵ带 ���� �ִ� ��ü���� ��Ÿ����
	Lotto lotto = new LottoImpl();
	Lotto rndLotto = new RandomLotto();

	// �������̽��� ������ ���� �߻�޼ҵ尡 �����Ƿ� new �����ڷ� ��ü�� ���� �� ����
//	Lotto lo = new Lotto();

	public static void main(String[] args) {
		// �������̽��� ������ ��ü�� ����ϸ�
		// ������� ���忡�� �ش� ��ü�� ����ϴ� ����� �����ϹǷ� ������ ���ϴ�
		LottoImpl lotto = new LottoImpl();
		lotto.printNumber(lotto.getNumbers());
		
		RandomLotto rndLotto = new RandomLotto();
		rndLotto.printNumber(rndLotto.getNumbers());
		
		Test test = new Test();
		test.rndLotto.printNumber(test.lotto.getNumbers());
	}
}
