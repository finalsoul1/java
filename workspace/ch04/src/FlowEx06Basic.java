
public class FlowEx06Basic {

	public static void main(String[] args) {

		String rank = "��";

		if (rank.equals("��")) { // true, false
			System.out.println("�ް�");
		} else {
			System.out.println("�Ʒ�");
		}

		switch (rank) { // ������
		case "��": // ��
			System.out.println("�ް�");
			break;
		default:
			System.out.println("�Ʒ�");
		}
	}

}
