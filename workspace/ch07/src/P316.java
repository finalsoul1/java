// �ڹ�Ŭ������ ����
// 1. ��� : Is-A Relation
// 2. ���� : Has-A Relation
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

// ȫ���� �̸��� �� �浿�ΰ���? No
// Gildong is HongFamily? Yes ==> ��Ӱ���
class Gildong extends HongFamily {

}

// ������ ���ΰ���? No
// ���� �����Դϱ�? Yes
class Animal {

}

class Dog extends Animal {

}