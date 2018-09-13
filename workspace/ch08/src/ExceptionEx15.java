import java.io.*;

class ExceptionEx15 {
	public static void main(String[] args) {

		args = new String[] { null };

		// command line에서 입력받은 값을 이름으로 갖는 파일을 생성한다.
		File f = createFile(args[0]);
		System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
	} // main메서드의 끝

	@SuppressWarnings("finally")
	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.equals(""))
				throw new Exception("파일이름이 유효하지 않습니다.");
		} catch (Exception e) {
			// fileName이 부적절한 경우, 파일 이름을 '제목없음.txt'로 한다.
			fileName = "제목없음.txt";
			
			// catch 블록 내 코드 : 해당 예외가 발생할 때만 작동한다
		} finally {
			// finally 블록 내 코드 : try 블록 내 코드 수행한 후, catch 블록 내 코드 기동여부와 상관없이
			// 언제나 최종적으로 작동하는 코드를 배치하는 공간이다
			File f = new File(fileName); // File클래스의 객체를 만든다.
			createNewFile(f); // 생성된 객체를 이용해서 파일을 생성한다.
			return f;
		}
	} // createFile메서드의 끝

	static void createNewFile(File f) {
		try {
			f.createNewFile(); // 프로젝트 폴더 밑에 파일을 생성한다.
		} catch (Exception e) {
		}
	} // createNewFile메서드의 끝
}
