package quiz3;

import java.util.Scanner;

public class Rabbit {

	// �������
	String name = "õ��";

	// ����޼ҵ�
	void forward() {
		System.out.println("������ ��ĭ");
	}

	void turnLeft() {
		System.out.println("�������� ����");
	}

	void turnRight() {
		System.out.println("���������� ����");
	}

	void flaThrow() {
		System.out.println("�ɴ���");
	}
	
	private static int getValueFromUser() {

		System.out.print("���ڸ� �Է��ϼ���.(��:12345)>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
		return Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

	}

	// ���α׷� �����ϱ�
	public static void main(String[] args) {
		// �̼Ǽ��� : �ݺ��� ����
		
		Rabbit rabbit = new Rabbit();
		
		System.out.println("�׳�� " + rabbit.name);
		
		int num=getValueFromUser();

		
	}
}
