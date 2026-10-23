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
		double [][] salesTot = new double[][] {
			 {100, 120, 130, 140}  //2022 : salesTot[0]
			,{140, 126, 130, 140}  //2023 : salesTot[1]
			,{130, 125, 130, 140}  //2024 : salesTot[2]
			,{160, 123, 130, 140}  //2025 : salesTot[3]
			,{360, 123, 130, 140}  //2026 : salesTot[4]
		};
		
		System.out.println("연도의 갯수" + salesTot.length );
		System.out.println("2024년의 매출갯수" + salesTot[2].length );
		
		//2024년 매출수량의 충합
		// total += salesTot[2][0]
		// total += salesTot[2][1]
		// total += salesTot[2][2]
		// total += salesTot[2][3]
		// total += salesTot[2][4]
			total =0;
		for (int i = 0; i < salesTot[2].length; i++) {
			total += salesTot[2][i];
		}
		System.out.println("2024년의 매출의 합" + total );
		
	}

}
