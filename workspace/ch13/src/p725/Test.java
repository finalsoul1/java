package p725;


public class Test {

	public static void main(String[] args) {
		String mainWorker = Thread.currentThread().getName();
		System.out.println(mainWorker);
		
		MyThread myt = new MyThread();
		myt.setName("1��");
		myt.start();
		
		MyRunnable myr = new MyRunnable();
		Thread myrT = new Thread(myr);
		myrT.setName("2��");
		myrT.start();
		
		Counter.count();
	}

}
