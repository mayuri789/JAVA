package multitasking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String date="2021-2-2";// default date format

LocalDate today= LocalDate.now();
DateTimeFormatter mypattern1= DateTimeFormatter.ofPattern("yyyy/MMM/dd");
DateTimeFormatter mypattern2= DateTimeFormatter.ofPattern("yy/MMM/d");

System.out.println(today);
//System.out.println(LocalDate.parse(date, mypattern1));
	
	today.format(mypattern1);
	System.out.println("MY FORMAT .."+today.format(mypattern1));
	System.out.println("MY FORMAT .."+today.format(mypattern2));
	
	
	LocalDate ld=LocalDate.parse(date,mypattern2);
	System.out.println(ld);
	
	
	
	
	}

}
