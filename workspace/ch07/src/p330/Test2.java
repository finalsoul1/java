package p330;

public class Test2 {

	public static void main(String[] args) {
		HongFamily[] people = {
				new Gildong(), 
				new Gildong(), 
				new Gildong(),
				new Gilsoon()
				};
					
		Korean[] koreans = {
				new Korean(),
				new HongFamily(),
				new Gildong()
				};
		
		Korean[] kors = {
				new HongFamily(),
				new KimFamily(),
				new LeeFamily()
				};
		
		allPlay(kors);
	}

	private static void allPlay(Korean[] kors) {
		for (int i = 0; i < kors.length; i++) {
			kors[i].play();
		}
	}
}
