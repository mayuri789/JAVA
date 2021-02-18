package multitasking;

import java.time.LocalDate;

public class DateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today=LocalDate.now();
		System.out.println("today date is : "+today);
	
	
		System.out.println("previous day :"+today.minusDays(1));
		
		System.out.println("previous day :"+today.plusDays(1));
		
		System.out.println("previous day :"+today.minusYears(1));
	
	
	}

}
