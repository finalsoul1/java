class NewExceptionTest {
	public static void main(String args[]) {
		try {
			startInstall();		// 프로그램 설치에 필요한 준비를 한다.
			copyFiles();			// 파일들을 복사한다. 
		} catch (SpaceException e)	{ // catch 블록은 하나만 작동함
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		} catch (MemoryException me)	{
			System.out.println("에러 메시지 : " + me.getMessage());
			me.printStackTrace();
			System.gc();		//  Garbage Collection을 수행하여 메모리를 늘려준다.
			System.out.println("다시 설치를 시도하세요.");
		} finally {
			deleteTempFiles();	// 프로그램 설치에 사용된 임시파일들을 삭제한다.
		} // try의 끝
	} // main의 끝

   static void startInstall() throws SpaceException, MemoryException { 
		if(!enoughSpace()) 		// 충분한 설치 공간이 없으면... // 메소드가 true, false를 리턴하면 조건문에 이용가능
			throw new SpaceException("설치할 공간이 부족합니다.");
		if (!enoughMemory())		// 충분한 메모리가 없으면...
			throw new MemoryException("메모리가 부족합니다.");
   } // startInstall메서드의 끝

   static void copyFiles() { /* 파일들을 복사하는 코드를 적는다. */ }
   static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다.*/}
   
   static boolean enoughSpace()   {
		// 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
		return false;
   }
   static boolean enoughMemory() {
		// 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다.
		return true;
   }
} // ExceptionTest클래스의 끝

/*
 * 사용자 정의 예외 클래스 만들기
 * 
 * class 클래스명 extends Exception : 체크드 예외를 만들고자 할 때
 * 
 * class 클래스명 extends RuntimeException : 언체크드 예외를 만들고자 할 때
 * 
 * class 클래스명 extends ArithmeticException : 이미 잘 만들어진 예외를
 * 약간의 기능 변경 및 기능 확장으로 사용하고자 할 때
 */

@SuppressWarnings("serial")
class SpaceException extends Exception {
//	String msg;
	SpaceException(String msg) {
//		this.msg = msg;
	   super(msg); // 이미 Exception에 그 기능 있음
   }
} 
@SuppressWarnings("serial")
class MemoryException extends Exception {
	// 예외를 나타내는 클래스명을 바꾸고 싶을 때 커스텀 예외 클래스를 만든다
	MemoryException(String msg) {
	   super(msg);	
   }
}
