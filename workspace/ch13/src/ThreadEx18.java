class ThreadEx18 {
	public static void main(String args[]) { // main 스레드는 사용자와 대화하는 역할
		// 다른 스레드들은 주로 시간이 오래걸리는 작업 수행 
		ThreadEx18_1 th1 = new ThreadEx18_1("*");
		ThreadEx18_1 th2 = new ThreadEx18_1("**");
		ThreadEx18_1 th3 = new ThreadEx18_1("***");
		th1.start();
		th2.start();
		th3.start();

		try {
			Thread.sleep(2000);
			th1.suspend();
			
			Thread.sleep(2000);
			th2.suspend();
			
			Thread.sleep(3000);
			th1.resume();
			
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			
			Thread.sleep(2000);
			th3.stop();
			
		} catch (InterruptedException e) {}
	}
}

class ThreadEx18_1 implements Runnable {
	boolean suspended = false;
	boolean stopped   = false;

	Thread th;

	ThreadEx18_1(String name) {
		th = new Thread(this, name); // Thread(Runnable r, String name)
	}

	public void run() {
		String name =th.getName();

		while(!stopped) {
			if(!suspended) {
				// suspended == false 인 동안, 아래 로직을 계속해서 처리
				System.out.println(name);
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					System.out.println(name + " - interrupted");
				}			
			} else {
				// suspended == true 가 되면, 아무것도 수행하지 않고
				// 다른 스레드가 바로 작업을 수행할 수 있도록 양보한다
				Thread.yield();
			}
		}
		System.out.println(name + " - stopped");
	}

	public void suspend() { // 잠시 중단한다
		suspended = true;
		th.interrupt();
		System.out.println(th.getName() + " - interrupt() by suspend()");
	}

	public void resume() { // 다시 시작한다
		suspended = false;
	}

	public void stop() {
		stopped = true;
		th.interrupt();
		System.out.println(th.getName() + " - interrupt() by stop()");
	}

	public void start() {
		th.start();
	}
}
