package p679;

import java.util.List;

public class Test {

	/*
	 * T, ? ����
	 * T : bound
	 * ? : unbound
	 * 
	 *  ���׸��� �ڵ��� �� Ÿ�� �������� Ȯ���ϱ� ���� ����ϴ� �����
	 *  �������ϸ� ���׸����� �ڵ尡 ��� �������
	 *  ����, ���׸��� ����ĳ������ �������� �ʴ´�
	 */
	
	List<? extends Object> names;
	names = new ArrayList<STring>();
	names = new ArrayList<Integer>();
	names.add(null);
	
	List<Object> names2;
	names = new ArrayList<STring>();
	names = new ArrayList<Integer>();
	names2.add(null);
}


class MyBox<T extends Object> {
	List<T> list = new ArrayList<T>;
	
	public T getLast() {
		return list.get(list.size() - 1);
	}
	
}