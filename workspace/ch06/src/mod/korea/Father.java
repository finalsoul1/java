package mod.korea;

public class Father {
	// ���������� 4����
	private String privateValue = "X"; // Ŭ���� �ڱ��ڽŸ� ������ �����ϴ�
	String defaultValue = "��"; // ���������� default ����, Ŭ���� �ڱ��ڽ� + ���� ��Ű�� �Ҽ� Ŭ����
	protected String protectedValue = "��"; // Ŭ���� �ڱ��ڽ� + ���� ��Ű�� �Ҽ� Ŭ���� + ��Ӱ��� Ŭ����
	public String publicValue = "��"; // ��� Ŭ������ ��δ� ������ �����ϴ�
	
	public void show() {
		System.out.println(privateValue);
		System.out.println(defaultValue);
		System.out.println(protectedValue);
		System.out.println(publicValue);
	}
}


