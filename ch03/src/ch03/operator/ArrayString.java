package ch03.operator;

import java.util.Scanner;

public class ArrayString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[][] arry = new int[3][3];
		Scanner sc = new Scanner(System.in);
		int menu = 0, sum = 0;
		double avg = 0;

		while (menu != 3) {
			System.out.println("1. �л� ���� �Է� 2. ��� ��� 3. ����");
			menu = sc.nextInt();

			if (menu == 1) {
                  
				for (int i = 0; i < 3; i++) {
					System.out.println("�л� "+(i+1)+" �� ������ ������ �Է��ϼ���. :");
					for (int j = 0; j < 3; j++) {
						int score = sc.nextInt();
						arry[i][j] = score;

					}
				}
			}

			if (menu == 2) {
				for (int i = 0; i < 3; i++) {
					System.out.print("�л� " + (i + 1) + " : ");

					for (int j = 0; j < 3; j++) {

						System.out.print(arry[i][j] + "�� ");
						sum += arry[i][j];
					}

					avg = Double.parseDouble(String.format("%.2f", (double) sum / 3));
					System.out.println(" ������ " + sum + " ����� " + avg);
					sum = 0;

				}
				double kor = 0, eng = 0, math = 0;
				for (int i = 0; i < 3; i++) {
					kor += arry[i][0];
					eng += arry[i][1];
					math += arry[i][2];
				}
				System.out.println("\n���� ��� : " + (kor / 3) + " ���� ��� : " + (eng / 3) + " ���� ��� : " + (math / 3)+"\n");
			}
		}
		System.out.println("�����մϴ�");

	}

}
