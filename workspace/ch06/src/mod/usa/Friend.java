package mod.usa;

import mod.korea.Father;

/*
 *  Son 클래스의 친구 Friend 클래스
 */

public class Friend {
	public void show() {
		
		Father father = new Father();
		
//		System.out.println(father.privateValue);
//		System.out.println(father.defaultValue);
//		System.out.println(father.protectedValue);
		System.out.println(father.publicValue);
	}
}
