//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

import java.util.regex.*;	// Pattern�� Matcher�� ���� ��Ű��

class RegularEx1 {
	public static void main(String[] args) 
	{
		String[] data = {
				"bat", "baby", "bonus",
				"cA","ca", "co", 
				"c.", "c0", "car",
				"combat","count","date", 
				"disc"};		
		
		// ����ǥ���� : �����Ϳ��� ���ϴ� ���ڿ��� ã�Ƴ��� ���ؼ� ����ϴ� ������ ����
		// c : ���� c
		// [a-z] : ���ĺ� �ҹ���
		// * : 0~n ��
		// c[a-z]*
		
		
		Pattern p = Pattern.compile("c[a-z]*");	// c�� �����ϴ� �ҹ��ڿ��ܾ�

		for(int i=0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.print(data[i] + ",");
		}
	}
}
