// 라이브러리 개발자
class NewClass {
	int newField;

	// 버전 2.0 일때 새로운 메소드를 제공하면서
	// 버전 1.0 일때 메소드를 그만쓰게 하고 대신 새로운 메소드를 사용하라고 안내하고자 한다
	int getNewField() { 
		return newField;
	}	

	// 버전 1.0 아래 메소드를 제공
//	@Deprecated
	int oldField;

//	@Deprecated
	int getOldField() { 
		return oldField;
	}
}

// 라이브러리를 사용하는 개발자
class AnnotationEx2 {
	public static void main(String args[]) {
		NewClass nc = new NewClass();

		nc.oldField = 10;                     //@Depreacted가 붙은 대상을 사용
		System.out.println(nc.getOldField()); //@Depreacted가 붙은 대상을 사용
	}
}
