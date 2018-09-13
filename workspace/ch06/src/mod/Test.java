package mod;

import mod.korea.Daughter;
import mod.korea.Employee;
import mod.korea.Father;
import mod.usa.Friend;
import mod.usa.Son;

public class Test {
	
	public static void main(String[] args) {
		Father f = new Father();
		f.show(); System.out.println();
		
		Daughter d = new Daughter();
		d.show(); System.out.println();
			
		Employee e = new Employee();
		e.show(); System.out.println();
		
		Son s = new Son();
		s.show(); System.out.println();
		
		Friend friend = new Friend();
		friend.show(); System.out.println();
	}
}
