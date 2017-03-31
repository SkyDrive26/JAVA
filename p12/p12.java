import java.util.Scanner;

public class p12{
	public static void main(String[] args){
		int year1;
		int month1;
		int day1;
		int totalDay1;
		
		int year2;
		int month2;
		int day2;
		int totalDay2;
		
		int yearDiff;
		int dayDiff;
		int hourDiff;
		int secDiff;
		int miliDiff;
		
		day1 = Integer.parseInt(dateNow.split("-")[0]);
		month1 = Integer.parseInt(dateNow.split("-")[1]);
		year1 = Integer.parseInt(dateNow.split("-")[2]);
		
		day2 = Integer.parseInt(input.split("-")[0]);
		month2 = Integer.parseInt(input.split("-")[1]);
		year2 = Integer.parseInt(input.split("-")[2]);
		
		totalDay1 = (dayNow + (monthNow * 31) + (yearNow * 365));
		totalDay2 = (dayIn + (monthIn * 31) + (yearIn * 365));
		
		if(year1 > year2 || (year1 == year2 && month1 > month2) || (year1 == year2 && month1 == month2 && day1 > day2)){
			yearDiff = year1 - year2;
			dayDiff = totalDay1 - totalDay2;
			hourDiff = dayDiff * 24;
			secDiff = hourDiff * 3600;
			miliDiff = secDiff * 1000;
		}else{
			yearDiff = year2 - year1;
			dayDiff = totalDay2 - totalDay1;
			hourDiff = dayDiff * 24;
			secDiff = hourDiff * 3600;
			miliDiff = secDiff * 1000;
		}
	}
}