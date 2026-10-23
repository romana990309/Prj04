package ex01;

import java.rmi.NotBoundException;

public class ArrayTest01 {
	// Array : 여러변수를 하나의 이름으로 통일해서 사용
	public static void main(String[] args) {
		// 김태연 , 서주현, 황미영
		String name1 =("김태연");
		String name2 =("서주현");
		String name3 =("황미영");
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println();
		
		String [] tts = new String[] {
			//	   0          1        2
				"김태연", "황미영", "서주현"
		};
		
		
			System.out.println( tts [0]);
			System.out.println( tts [1]);
			System.out.println( tts [2]);
		    System.out.println();
		    
			//try {
		    for (int i = 0; i < tts.length; i++) {
				System.out.println( tts [i]);}
		      //  }
		//	catch (ArrayIndexException e) {};
		//	System.out.println(tts[6]);
			
	}
	

}
