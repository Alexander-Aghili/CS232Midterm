import java.util.Random;

public class CalendarDate implements Comparable<CalendarDate>{

	private Integer day;
	private Integer month;
	
	public CalendarDate() {
		this.month = 5;
		Random rand = new Random();
		this.day = rand.nextInt(31) + 1;
	}

	//Made for testing, may be used if wanted. Still a random day but a set month
	public CalendarDate(int month) {
		if (month < 13 && month > 0) {
			this.month = month;
			Random rand = new Random();
			this.day = rand.nextInt(31) + 1;
		}
		else 
			System.out.println("Bad Input. Object not created.");
	}
	
	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public boolean equals(Object obj) {
		if (obj instanceof CalendarDate) {
			CalendarDate otherDate = (CalendarDate) obj;
			return this.month == otherDate.month && this.day == otherDate.day;
		} else {
			return false;
		}
	}
	
	//Returns -1 when day and month is less than this
	//Returns 1 when day and month is greater than this
	@Override
	public int compareTo(CalendarDate otherDate) {
		if(this.equals(otherDate)) {
			return 0;
		} else {
			if (this.month.equals(otherDate.month)) {
				return otherDate.day.compareTo(this.day);
			} else {
				return otherDate.month.compareTo(this.month);
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
