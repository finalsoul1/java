import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;

public class ArrayListEx1Practice {
	public static void main(String[] args) {
		// ���ڿ� �ټ��� �Ѳ����� �����Ѵ�
		// �������� ������ �� �� ����� ����
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

		list1.add("������");

		Collections.sort(list1); // ��������

		// �ݺ��۾��� ������ �� ����� �� �ִ� �÷����� ǥ�ر��
		Iterator<String> iter = list1.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
		System.out.println();

		Comparator<Object> comparator = Collections.reverseOrder(); // ��������

		// list�� ����Ű�� ArrayList<String> ��ü�� �����ϴ� <String> ���ڿ��� �� ���� ���ʴ�� ������
		// comparator ��ü�� int compare(T o1, T o2); ��� �޼ҵ忡�� �Ķ���ͷ� �����Ͽ�
		// ū �Ͱ� ���� ���� ������ ���� �̸� �������� ������ �����Ѵ�
		Collections.sort(list1, comparator);

		
		System.out.println(list1);

		list1.remove("Hello");
		System.out.println(list1);

		list1.remove(2);
		System.out.println(list1);

		// �޼ҵ忡�� �����ϴ� filter������ �����Ͽ� true�̸� �ش� �����͸� �����Ѵ�
		Predicate<? super String> filter = new Filter();
		// true/false ���θ� �Ǵ��ϴ� Predicate �������̽� ����ü�� �����޼ҵ� test��
		// ����ϴ� ���� removeIf �޼ҵ� �� ������ ó���Ѵ�
		list1.removeIf(filter);
		System.out.println(list1);
	}
}

class Filter implements Predicate<String> {

	@Override
	public boolean test(String txt) {
		// ���ڿ� �ȿ� a��� ���ڰ� �ִٸ� true�� �����Ѵ� == > �ش� ���ڿ��� �����ȴ�
		return txt.contains("a");
	}
}
