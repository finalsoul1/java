class FlowEx22 {
	public static void main(String[] args) { 
		int[] arr = {10,20,30,40,50};
		int sum = 0;
	
		for(int i=0;i<arr.length;i++) { // i < 5   0, 1, 2, 3, 4
			// �迭�� �����ϴ� ���� [�ε���] : �ε����� 0���� �����Ѵ�
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();		

		// ������ for���� ȸ������ �����ϴ� ����( i )�� �ʿ� ����. �迭�� ���̸�ŭ �ڵ����� �ݺ��Ѵ�
		for(int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();		
		System.out.println("sum="+sum);
	} // main�� ��
}
