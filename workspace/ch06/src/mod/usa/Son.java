package mod.usa;

// Son Ŭ������ Father Ŭ������ �ٸ� ��Ű���� �ֱ� ������ import�� ��θ� ��������� �Ѵ�
import mod.korea.Father;

public class Son extends Father {
	public void show() {
//		System.out.println(privateValue);
//		System.out.println(defaultValue); // Son Ŭ������ Father Ŭ������ ��Ű���� �ٸ���
		System.out.println(protectedValue);
		System.out.println(publicValue);
	}
}
