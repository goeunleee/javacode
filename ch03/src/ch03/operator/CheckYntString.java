package ch03.operator;

import java.util.Scanner;

public class CheckYntString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		char tmp;
		boolean output = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("�Է��ϼ��� : ");
		String input = scan.nextLine();

		for (int i = 0; i < input.length(); i++) {
			tmp = input.charAt(i);

			if (!('0' <= tmp && tmp <= '9')) {
				output = false;
			}
		}
		System.out.println("�����Դϱ�? : " + output);
	}

}
 