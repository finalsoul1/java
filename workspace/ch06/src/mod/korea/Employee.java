package mod.korea;

/*
 *  Father Ŭ������ �������� Employee Ŭ����
 */
public class Employee {
	public void show() {
		// Employee Ŭ������ Father Ŭ������ ��Ӱ��谡 �ƴϹǷ�
		// Employee Ŭ�������� Father Ŭ������ �ڿ��� ����Ϸ��� Father Ŭ������ ���� ��ü�� ȹ���ؾ� �Ѵ�
		
		Father father = new Father();
		
//		System.out.println(father.privateValue);
		System.out.println(father.defaultValue); 
		System.out.println(father.protectedValue);
		System.out.println(father.publicValue);
	}
}
