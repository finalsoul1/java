// 자바클래스의 관계
// 1. 상속 : Is-A Relation
// 2. 조립 : Has-A Relation
public class P316 {
	public static void main(String[] args) {

	}
}

// MyCar is MyEngine? No
// MyEngine is MyCar? No
// MyCar has MyEngine? Yes
// MyEngine has MyCar? No
class MyCar {
	MyEngine engine;
}

class MyEngine {

}

class HongFamily {

}

// 홍씨는 이름이 다 길동인가요? No
// Gildong is HongFamily? Yes ==> 상속관계
class Gildong extends HongFamily {

}

// 동물은 개인가요? No
// 개는 동물입니까? Yes
class Animal {

}

class Dog extends Animal {

}