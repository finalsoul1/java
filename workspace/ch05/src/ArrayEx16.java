class ArrayEx16 {
	
	// java ArrayEx16 abc 123 "HI !!"
	public static void main(String[] args) {
		System.out.println("매개변수의 개수:"+args.length);

		for(int i=0;i< args.length;i++) {
			System.out.println("args[" + i + "] = \""+ args[i] + "\"");
		}
	}
}
