// ���̺귯�� ������
class NewClass {
	int newField;

	// ���� 2.0 �϶� ���ο� �޼ҵ带 �����ϸ鼭
	// ���� 1.0 �϶� �޼ҵ带 �׸����� �ϰ� ��� ���ο� �޼ҵ带 ����϶�� �ȳ��ϰ��� �Ѵ�
	int getNewField() { 
		return newField;
	}	

	// ���� 1.0 �Ʒ� �޼ҵ带 ����
//	@Deprecated
	int oldField;

//	@Deprecated
	int getOldField() { 
		return oldField;
	}
}

// ���̺귯���� ����ϴ� ������
class AnnotationEx2 {
	public static void main(String args[]) {
		NewClass nc = new NewClass();

		nc.oldField = 10;                     //@Depreacted�� ���� ����� ���
		System.out.println(nc.getOldField()); //@Depreacted�� ���� ����� ���
	}
}
