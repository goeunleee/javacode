package ch05;

import java.util.Calendar;

public class EnumExample {

	public static void main(String[] args) {
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WENDSESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;

		}//
		
		
		if (today == Week.SUNDAY || today == Week.SATURDAY) {
			System.out.println("¥ ¿·¿ª ¿‚¥œ¥Ÿ");
		}
		else
			System.out.println("ø¿¥√¿∫ "+today+" ¿œ¬Ô ¿œæÓ≥≥¥œ¥Ÿ");

	}

}
