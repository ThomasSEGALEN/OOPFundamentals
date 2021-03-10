package fr.campusacademy.oopcourse.mytime.model;

public class MyTime {
	private int hour;
	private int minute;
	private int second;

	public MyTime() {
		
	}

	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

	public MyTime nextSecond() {
		if(second == 59) {
			second = 0;
		} else {
			second = second + 1;
		}
		return this;
	}

	public MyTime nextMinute() {
		if(minute == 59) {
			minute = 0;
		} else if(second == 59) {
			minute = minute + 1;
		}
		return this;
	}

	public MyTime nextHour() {
		if(hour == 23 && minute == 59) {
			hour = 0;
		} else if (minute == 59){
			hour = hour + 1;
		}
		return this;
	}

//	public MyTime previousSecond() {
//		if(second - 1 == 0) {
//			second = 59;
//		} else {
//			second = second - 1;
//		}
//		return this;
//	}
//
//	public MyTime previousMinute() {
//		if(minute - 1 == 0) {
//			minute = 59;
//		} else {
//			minute = minute - 1;
//		}
//		return this;
//	}
//
//	public MyTime previousHour() {
//		if(hour - 1 == 0) {
//			hour = 23;
//		} else {
//			hour = hour - 1;
//		}
//		return this;
//	}
}
