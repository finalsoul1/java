package p771;

public class Consu

public class DataBox {

	
	public synchronized String getData() {
		// data�� null�̸� �Һ��� �����带 �Ͻ� ���� ���·� ����
		if (this.data != null) {
			try {
				wait();
			}catch(Exception e) {}
			}
		}
			
		}
	}
