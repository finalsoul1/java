
public class P294 {

	public static void main(String[] args) {
		House house1= new House();
		System.out.println(house1.color);
		House house2 = new House("Red", 4);
		System.out.println(house2.color);
		
		house1.openDoor();
	}
}

class House {
	String color = "white";
	int rooms = 3;
	
	public void openDoor() {
		System.out.println("���� ���� ����.");
	}
	
	public House() {
		System.out.println("House() called.");
	}

	public House(String color, int rooms) {
		super();
		// this : ��ü������ �ڱ��ڽ��� ��Ī�Ѵ�
		this.color = color;
		this.rooms = rooms;
		System.out.println("House(String color, int rooms) called.");
	}
}