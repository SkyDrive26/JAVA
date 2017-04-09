import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Computation {

	private int year1;
	private int month1;
	private int day1;
	
	private int year2;
	private int month2;
	private int day2;

	public Computation(int y1, int m1, int d1, int y2, int m2, int d2) {
		this.year1 = y1;
		this.month1 = m1;
		this.day1 = d1;
		
		this.year2 = y2;
		this.month2 = m2;
		this.day2 = d2;
	}

	public int[] returnCalculations() {
		LocalDate firstDate = new LocalDate(year1, month1, day1);
		LocalDate secondDate = new LocalDate(year2, month2, day2);

		int years = Years.yearsBetween(firstDate, secondDate).getYears();
		int months = Months.monthsBetween(firstDate, secondDate).getMonths();
		int weeks = Weeks.weeksBetween(firstDate, secondDate).getWeeks();
		int days = Days.daysBetween(firstDate, secondDate).getDays();
		int hours = Hours.hoursBetween(firstDate, secondDate).getHours();
		int minutes = Minutes.minutesBetween(firstDate, secondDate).getMinutes();
		int seconds = Seconds.secondsBetween(firstDate, secondDate).getSeconds();

		int[] values = { years, months, weeks, days, hours, minutes, seconds };
		return values;
	}

	public boolean isValidDate() {
		String date1 = day1 + "-" + month2 + "-" + year2;
		String date2 = day2 + "-" + month2 + "-" + year2;
		try {
			DateTimeFormatter dtf = DateTimeFormat.forPattern("dd-MM-yyyy");
			dtf.parseDateTime(date1);
			dtf.parseDateTime(date2);
			return true;
		} catch (IllegalArgumentException iae) {
			return false;
		}
	}

}
