class FlowEx22 {
	public static void main(String[] args) { 
		int[] arr = {10,20,30,40,50};
		int sum = 0;
	
		for(int i=0;i<arr.length;i++) { // i < 5   0, 1, 2, 3, 4
			// 배열을 참조하는 변수 [인덱스] : 인덱스는 0부터 시작한다
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();		

		// 진보된 for문은 회전수를 제어하는 변수( i )가 필요 없다. 배열의 길이만큼 자동으로 반복한다
		for(int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();		
		System.out.println("sum="+sum);
	} // main의 끝
}
