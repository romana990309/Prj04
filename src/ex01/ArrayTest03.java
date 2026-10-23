package ex01;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		  LocalDateTime now = LocalDateTime.now();
		System.out.println("오늘 날짜:" + now);
		
		String yoil = getyoil(); //"금요일";
		System.out.println("요일 한자:" + yoil );

	}

	private static String getyoil() {
		String [] y = new String[] {
				"月","火","水","木","金","土","日"
		};
		
		
		LocalDate now = LocalDate.now();
		int wk = now.getDayOfWeek().getValue(); //1(월) ~ 7(일)
		String yoil = y[wk-1];
		return yoil + "요일";
	}
				
}
