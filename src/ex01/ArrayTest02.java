package ex01;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		int [] sales = new int[] {
			100, 80, 90, 110	
		};
		
		int total = 0;
		/*
		total = total + sales[0];
		total += sales[1];
		total += sales[2];
		total += sales[3];
		 */
		for (int i = 0; i < sales.length;i ++) {
			total += sales [i];
		} 
		System.out.println(total);
		
		//------------------------------------------------
		//2차원 배열 연습
	}

}
