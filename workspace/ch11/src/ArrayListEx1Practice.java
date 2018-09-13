import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;

public class ArrayListEx1Practice {
	public static void main(String[] args) {
		// 문자열 다수를 한꺼번에 보관한다
		// 오름차순 정렬을 한 후 출력해 본다
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Hi");
		list1.add("Hello");
		list1.add("Hello");
		list1.add("Bye");
		list1.add("aha");
		System.out.println(list1.size());

		for (String n : list1) {
			System.out.print(n + ", ");
		}

		System.out.println("\n" + list1);

		System.out.println(list1.get(0));
		System.out.println(list1.get(list1.size() - 1));
		System.out.println();

		list1.add("ㅋㅋㅋ");

		Collections.sort(list1); // 오름차순

		// 반복작업을 수행할 때 사용할 수 있는 컬렉션의 표준기술
		Iterator<String> iter = list1.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
		System.out.println();

		Comparator<Object> comparator = Collections.reverseOrder(); // 내림차순

		// list가 가리키는 ArrayList<String> 객체가 보관하는 <String> 문자열을 두 개씩 차례대로 꺼내서
		// comparator 객체의 int compare(T o1, T o2); 라는 메소드에게 파라미터로 전달하여
		// 큰 것과 작은 것을 구분한 다음 이를 바탕으로 정렬을 수행한다
		Collections.sort(list1, comparator);

		
		System.out.println(list1);

		list1.remove("Hello");
		System.out.println(list1);

		list1.remove(2);
		System.out.println(list1);

		// 메소드에게 전달하는 filter로직을 수행하여 true이면 해당 데이터를 삭제한다
		Predicate<? super String> filter = new Filter();
		// true/false 여부를 판단하는 Predicate 인터페이스 구현체의 구현메소드 test를
		// 사용하는 것은 removeIf 메소드 내 로직이 처리한다
		list1.removeIf(filter);
		System.out.println(list1);
	}
}

class Filter implements Predicate<String> {

	@Override
	public boolean test(String txt) {
		// 문자열 안에 a라는 글자가 있다면 true를 리턴한다 == > 해당 문자열은 삭제된다
		return txt.contains("a");
	}
}
