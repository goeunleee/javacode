package ch03.operator;

import java.io.IOException;

public class Speed {

	public static void main(String[] args) throws IOException {
		int keycode = 0;
		int speed = 10;
		boolean run = true;
		while (run) {
			if (keycode != 13 && keycode != 10) {
				System.out.println("------------------------------------------");
				System.out.println("   1.증속   |     2.감속    |   3.정지    ");
				System.out.println("------------------------------------------");
				System.out.println("선택 : ");

			}

			keycode = System.in.read();//한글자입력

			if (keycode == 49) {
				speed++;
				System.out.println("현재 속도 : " + speed);
			} else if (keycode == 50) {
				speed--;
				System.out.println("현재 속도 : " + speed);
			} else if (keycode == 51) {
				System.out.println("end ");
				run = false;

			}
		}
	}

}
