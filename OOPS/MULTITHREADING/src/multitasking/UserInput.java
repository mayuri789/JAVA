package multitasking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter booking date in yyyy/mm/dd format..");
		String bookingdate=sc.next();
		
		DateTimeFormatter pattern= DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		System.out.println(bookingdate);
		
		LocalDate bk=LocalDate.parse(bookingdate,pattern);
		System.out.println("booking date "+bk);
		System.out.println("booking date "+bk.format(pattern));
		
		
		
		
	}

}
