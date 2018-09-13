package p377;



public class Test {

	public static void main(String[] args) {
		
		LottoImpl lotto = new LottoImpl();
		lotto.printNumber(lotto.getNumbers());
		int[][] numbers = {
				lotto.getNumbers(),
				{11, 12, 13, 14, 15, 16},
				lotto.getNumbers()
		};
		lotto.printNumbersMulti(numbers);
		
		RandomLotto rndLotto = new RandomLotto();
		rndLotto.printNumber(rndLotto.getNumbers());
		
	}
}
