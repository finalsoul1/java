
public class FlowEx06Basic {

	public static void main(String[] args) {

		String rank = "»óº´";

		if (rank.equals("»óº´")) { // true, false
			System.out.println("ÈÞ°¡");
		} else {
			System.out.println("ÈÆ·Ã");
		}

		switch (rank) { // º¯¼ö¸í
		case "»óº´": // °ª
			System.out.println("ÈÞ°¡");
			break;
		default:
			System.out.println("ÈÆ·Ã");
		}
	}

}
