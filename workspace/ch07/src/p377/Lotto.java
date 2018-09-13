package p377;

/*
 *  추상화 정도로 구분하는 3가지
 *  [concrete] class : 구체클래스, 일반클래스 : 일반 메소드만 존재 할 수 있다
 *  abstract class : 일반메소드도 있고, 추상메소드도 있을 수 있다. 추상메소드 앞에 abstract 키워드를 생략할 수 없다
 *  interface : 일반메소드가 없는 인터페이스, abstract 키워드를 생략해도 붙은 것으로 인정한다
 */
public abstract class Lotto {

	public abstract void printNumber(int[] numbers);

	public abstract int[] getNumbers();

	public void printNumbersMulti(int[][] numbers) {
		for (int[] nums : numbers) {
			for (int n : nums) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
