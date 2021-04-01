import java.util.Random;

public class CalendarDate implements Comparable<CalendarDate>{

	private Integer day;
	private Integer month;
	
	public CalendarDate() {
		this.month = 5;
		Random rand = new Random();
		this.day = rand.nextInt(30) + 1;
		System.out.println(day);
	}

	public CalendarDate(int month) {
		if (month < 13 && month > 0)
			this.month = month;
		Random rand = new Random();
		this.day = rand.nextInt(30) + 1;
		System.out.println(day);
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof CalendarDate) {
			CalendarDate otherDate = (CalendarDate) obj;
			return this.month == otherDate.month && this.day == otherDate.day;
		} else {
			return false;
		}
	}
	
	@Override
	public int compareTo(CalendarDate otherDate) {
		System.out.println("Month: " + otherDate.month);
		System.out.println("Day: " + otherDate.day);
		if(this.equals(otherDate)) {
			return 0;
		} else {
			if (this.month.equals(otherDate.month)) {
				return this.day.compareTo(otherDate.day);
			} else {
				return this.month.compareTo(otherDate.month);
			}
		}
	}
	
	public boolean checkDate(CalendarDate[] dates) {
		for (int i = 0; i < dates.length; i++) {
			if (dates[i].equals(this)) 
				return true;
		}
		return false;
	}
	
}
