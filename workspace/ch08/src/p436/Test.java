package p436;

import java.util.Scanner; // Ǯ�н��� �ٿ�����
// import java.lang.System; 
// java.lang �ؿ� Ŭ�������� �ʹ��� �߿��ϰ� ������ ����ϱ� ������
// ����Ʈ ������ �����ص� ����Ʈ ������ �� ������ �����Ѵ�


public class Test {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			System.out.print("input: ");
			
			String input = scan.nextLine();
			System.out.println(input);
			
//			scan.close(); // try() : �ڵ� �ڿ� �ݳ����� ������ �����ϴ�
		} catch (Exception e) {
			
		}
		
	}
}
