class FlowEx23 {
	public static void main(String[] args) throws InterruptedException {
		
		boolean condition = true;
		
		int count = Integer.MAX_VALUE - 1;
		
		while(condition) {
			System.out.println(count);
			count = count + 1;
			
			Thread.sleep(1000);
		}
	}
}
