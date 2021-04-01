import java.util.Random;

public class CalendarDriver{

	public static void main(String[] args) {
		CalendarDate date = new CalendarDate();
		System.out.println("Month: " + date.getMonth() + " Day " + date.getDay());
		
		
		CalendarDate[] dates = new CalendarDate[100];
		
		for(int i = 0; i < 100; i++) {
			Random rand = new Random();
			int num = rand.nextInt(12) + 1;
			CalendarDate newDate = new CalendarDate(num);
			System.out.println("Month: " + newDate.getMonth() + " Day " + newDate.getDay());
			dates[i] = new CalendarDate(num);
		}
		System.out.println(date.checkDate(dates));
	}

}
