package p679;

import java.util.List;

public class Test {

	/*
	 * T, ? 차이
	 * T : bound
	 * ? : unbound
	 * 
	 *  지네릭은 코딩할 때 타입 안정성을 확보하기 위해 사용하는 기술로
	 *  컴파일하면 지네릭관련 코드가 모두 사라진다
	 *  따라서, 지네릭은 오토캐스팅을 지원하지 않는다
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