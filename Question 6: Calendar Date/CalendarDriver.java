
public class CalendarDriver{

	public static void main(String[] args) {
		CalendarDate date = new CalendarDate();
		
		CalendarDate[] dates = {new CalendarDate(3), new CalendarDate(), new CalendarDate(), new CalendarDate(6)};
		System.out.println(date.checkDate(dates));
	}

}
