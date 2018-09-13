package p330;

public class Test3 {
	public static void main(String[] args) {
		Korean[] kors = { new HongFamily(), new KimFamily(), new LeeFamily() };

		allPlay(kors);
	}

	private static void allPlay(Korean[] kors) {
		for (int i = 0; i < kors.length; i++) {
			kors[i].play();

			// �迭���� ���� ��ü�� HongFamily �̸� �߰������� doSomethingAfterMeal() �޼ҵ带 �����Ѵ�
			// �迭���� ���� ��ü�� KimFamily �̸� �߰������� walk() �޼ҵ带 �����Ѵ�
			if (kors[i] instanceof HongFamily) {
				HongFamily hf = (HongFamily) kors[i];
				hf.doSomethingAfterMeal();
			} else if (kors[i] instanceof KimFamily) {
				KimFamily kf = (KimFamily) kors[i];
				kf.walk();
			}
		}
	}

}
