package practise2;

public class Time {
	int hour, minute, second;
	
	public Time(int hour, int minute, int second){
		setTime(hour, minute, second);	
	}
	
	public void setTime(int hour, int minute, int second) {
	    if (hour < 0 || hour > 23 ||
	        minute < 0 || minute > 59 ||
	        second < 0 || second > 59) {
	        this.hour = 0;
	        this.minute = 0;
	        this.second = 0;
	    } 
	    else {
	        this.hour = hour;
	        this.minute = minute;
	        this.second = second;
	    }
	}
	public String toUniversal() {
	    return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toStandard() {
	    int standardHour;
	    String period;

	    if (hour == 0) {
	        standardHour = 12;
	        period = "AM";
	    } else if (hour < 12) {
	        standardHour = hour;
	        period = "AM";
	    } else if (hour == 12) {
	        standardHour = 12;
	        period = "PM";
	    } else {
	        standardHour = hour - 12;
	        period = "PM";
	    }

	    return String.format("%02d:%02d:%02d %s",
	            standardHour, minute, second, period);
	}
	
	public void add(Time other) {
	    this.second += other.second;
	    this.minute += other.minute;
	    this.hour += other.hour;

	    if (this.second >= 60) {
	        this.minute += this.second / 60;
	        this.second %= 60;
	    }

	    if (this.minute >= 60) {
	        this.hour += this.minute / 60;
	        this.minute %= 60;
	    }

	    this.hour %= 24;
	}
	
	    public static void main(String[] args) {
	        Time t = new Time(23, 5, 6);
	        System.out.println("Universal format "+t.toUniversal());
	        System.out.println("Standard format "+t.toStandard());

	        Time t2 = new Time(23, 24, 33);
	        t.add(t2);

	        System.out.println(t.toUniversal());
	    }
}
