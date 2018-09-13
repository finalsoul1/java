//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

import java.util.regex.*;	// Pattern과 Matcher가 속한 패키지

class RegularEx1 {
	public static void main(String[] args) 
	{
		String[] data = {
				"bat", "baby", "bonus",
				"cA","ca", "co", 
				"c.", "c0", "car",
				"combat","count","date", 
				"disc"};		
		
		// 정규표현식 : 데이터에서 원하는 문자열을 찾아내기 위해서 사용하는 정해진 문법
		// c : 글자 c
		// [a-z] : 알파벳 소문자
		// * : 0~n 개
		// c[a-z]*
		
		
		Pattern p = Pattern.compile("c[a-z]*");	// c로 시작하는 소문자영단어

		for(int i=0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.print(data[i] + ",");
		}
	}
}
