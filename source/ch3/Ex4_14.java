
public class Ex4_14 {

	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
			input = s.nextInt();
			
			if(input > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			} else if(input < answer) {
				System.out.println("�� ū ���� �Է��ϼ���");
			} else {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� "+count+"���Դϴ�.");
				break;
			}
		}
		while(true);
	}

}
