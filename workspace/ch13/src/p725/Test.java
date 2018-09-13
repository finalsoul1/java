package p725;


public class Test {

	public static void main(String[] args) {
		String mainWorker = Thread.currentThread().getName();
		System.out.println(mainWorker);
		
		MyThread myt = new MyThread();
		myt.setName("1¹ø");
		myt.start();
		
		MyRunnable myr = new MyRunnable();
		Thread myrT = new Thread(myr);
		myrT.setName("2¹ø");
		myrT.start();
		
		Counter.count();
	}

}
