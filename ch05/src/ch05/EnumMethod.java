package ch05;

public class EnumMethod {

	public static void main(String[] args) {
		Week today = Week.SUNDAY; //1
		String name = today.name();
		System.out.println(name);

		// oridinal method
		int oridinal = today.ordinal();
		System.out.println(oridinal); // friday -> 6

		Week day1 = Week.MONDAY;// 2
		Week day2 = Week.WENDSESDAY;// 4
		int res1 = day1.compareTo(day2); // 2-4
		int res2 = day2.compareTo(day1); // 4-2
		System.out.println(res1); // -2
		System.out.println(res2); // 2

		if (args.length == 1) {
			String strday = args[0];
			Week weekDay = Week.valueOf(strday);
			if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY)
				System.out.println("ÁÖ ¸» ÀÌ ´Ù!");
			else
				System.out.println("ÆòÀÏ .. ¤¨ ¤ÄÀ× Âì");
		}

		Week[] days = Week.values();
		for (Week day : days)
			System.out.println(day);

	} // ml

}
