package ch03.operator;

import java.util.Scanner;

public class Swca {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rand = (int) (Math.random() * 100) + 1;
		boolean output = true;
		int cnt = 0;
		String input;
		char tmp;
		System.out.println(rand);
		Scanner in = new Scanner(System.in);

		while (cnt < 10) {
			System.out.println((cnt + 1) + "��° �õ� : \n");

			input = in.nextLine();
			output = true;
			for (int i = 0; i < input.length(); i++) {
				tmp = input.charAt(i);

				if (!('0' <= tmp && tmp <= '9')) {
					output = false;
				}
			}
			if (output == false) {
				System.out.println("���ڰ� �ƴմϴ�");
			} 
			
			else {
				
				int inputInt = Integer.parseInt(input);

				if (inputInt > rand) {
					System.out.println("Down");
					cnt++;
				}
				if (inputInt < rand) {
					System.out.println("Up");
					cnt++;
				}
				if (inputInt == rand) {
					System.out.println("�����Դϴ�.");
					cnt++;
					break;
				}
			}

		}
		System.out.println("����� ������ "+(110-(cnt*10)));

	}

}
