import java.util.*;

class HashSetEx4 {
	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<>();

		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person2("David", 10));
		set.add(new Person2("David", 10));

		Person2 p1 = new Person2("David", 10);
		Person2 p2 = new Person2("David", 10);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		System.out.println(set);
	}
}

class Person2 extends Object {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// set은 중복을 체크할 때 객체의 equals, hashCode 메소드를 호출하여
	// 그 결과로 중복여부를 체크합니다
	// 콜렉션에서 이 설계도로 만든 객체를 보관할 때, 
	// 객체가 가진 상태값이 같다면(동등하다면) 이러한 객체를 1개만 보관하면 될 때,
	// 중복 데이터를 가진 객체를 추가로 저장하지 않기 위하여
	// equals, hashCode 메소드를 재정의하시면 됩니다
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person2) {
			Person2 tmp = (Person2) obj;
			return name.equals(tmp.name) && age == tmp.age;
		}

		return false;
	}

	@Override
	public int hashCode() {
		// String 클래스의 hashCode 메소드는 값이 같으면 같은 해쉬코드 숫자를 
		// 리턴하도록 재정의 되어 있습니다
		return (name + age).hashCode();
	}

	@Override
	public String toString() {
		return name + ":" + age;
	}
}
