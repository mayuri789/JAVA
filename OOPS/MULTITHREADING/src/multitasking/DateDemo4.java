package multitasking;

import java.time.LocalDate;
import java.time.Period;

public class DateDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today=LocalDate.now();
		System.out.println("today date is : "+today);
	
		
		LocalDate bookingDate= LocalDate.of(2021,1,2);
		System.out.println("booking date : "+bookingDate);
		
		boolean validatedate= bookingDate.isAfter(today);
		if(validatedate)
		
			System.out.println("correct date");
			else
				System.out.println("booking date should be future date ..");
		
		System.out.println("======================");
		
		Period p=Period.between(today, bookingDate);
		System.out.println(p.getYears()+"year : "+p.getMonths()+"month"+p.getDays()+"days :");
		
	}

}
