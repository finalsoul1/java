import java.util.Arrays;
import java.util.StringJoiner;

class StringEx4 {
	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr   = animals.split(",");
		System.out.println(Arrays.toString(arr));

		/*
		 * String.join(CharSequence delimiter, CharSequence... elements) 
		 * ��Ʈ���� CharSequence �������̽� ����ü�̹Ƿ� CharSequence �޶�� �� ��
		 * ��� ��Ʈ�� ��ü�� �� �� �ִ� : ������ �൵ �ǰ� �迭�� �൵ �ȴ�
		 */
		System.out.println(String.join("-", arr));
		System.out.println(String.join("-", "��", "��", "��", "��"));

		StringJoiner sj = new StringJoiner("/","[","]");
		for(String s : arr)
			sj.add(s);

		System.out.println(sj.toString());
	}
}
