package multitasking;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		
		
		LocalDate today=LocalDate.now();
		System.out.println("today date is : "+today);
		System.out.println("day of year :"+today.getDayOfYear());
		System.out.println("month : "+today.getDayOfMonth());
		System.out.println("year :"+today.getYear());
		System.out.println(" is a leap year ? "+today.isLeapYear());

	}

}
