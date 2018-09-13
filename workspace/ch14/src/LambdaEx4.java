import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

class LambdaEx4 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++)
			list.add(i);

		// fore + ��Ʈ�� + �����̽�
		for (Integer i : list) {
			System.out.print(i + ", ");
		}
		System.out.println("\n--------------------------");
		
		// super Integer = Integer�� �θ�Ŭ���� ex)Number
		// �߻�޼ҵ忡 �ٵ� �ٿ��� ��ũ��Ʈ �޼ҵ�� new�� �����ϰ���
		// �͸�Ŭ����
		Consumer<Integer> action = new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				System.out.print(i + ",");
			}
		};
		
		// list�� ��� ��Ҹ� ���
		list.forEach(action);
		System.out.println();
		// �Ķ���� -> �ٵ𿬻��ڻ���, ���ϻ���
		list.forEach(i -> System.out.print(i + ",")); // for���� ���߰� �ٽ��� �ΰ�
		
		System.out.println("\n--------------------------");


		// list���� 2 �Ǵ� 3�� ����� �����Ѵ�.
		// remove if ���ǽ�(���ǽĿ� ��ü�� ����, ��ü�� ���ϰ��� true/false�� ��)
		list.removeIf(x -> x % 2 == 0 || x % 3 == 0); // if���� ���߰� ���ǽ��� �ΰ�
		System.out.println(list);

		// ��ü���� ���α׷��� vs �Լ��� ���α׷���
		// �Լ��� ���α׷����� �Լ��� ������ ���·� �и��� ����
		// �����ؼ� ����ϴ� ����� ������ �� ��뼺�� �ش�ȭ �� �� �ִ� ����̴�
		// ��ü���� ���α׷��ֿ��� ���� ����ϴ� ��ƿ Ŭ������ ����ϸ�
		// �Լ� �� ��뼺�� �ش�ȭ �ϱ� ���ؼ� ��ü �� �ϳ��� �޼ҵ常 ��ġ�ϴ�
		// ���¸� ���Ѵ�
		
		list.replaceAll(i -> i * 10); // list�� �� ��ҿ� 10�� ���Ѵ�.
		System.out.println(list);

		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");

		// map�� ��� ��Ҹ� {k,v}�� �������� ����Ѵ�.
		map.forEach((k, v) -> System.out.print("{" + k + "," + v + "},"));
		System.out.println();
	}
}