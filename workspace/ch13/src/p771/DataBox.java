package p771;

public class Consu

public class DataBox {

	
	public synchronized String getData() {
		// data가 null이면 소비자 스레드를 일시 정지 상태로 만듦
		if (this.data != null) {
			try {
				wait();
			}catch(Exception e) {}
			}
		}
			
		}
	}
