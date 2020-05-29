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
			System.out.println("1. 학생 점수 입력 2. 결과 출력 3. 종료");
			menu = sc.nextInt();

			if (menu == 1) {
                  
				for (int i = 0; i < 3; i++) {
					System.out.println("학생 "+(i+1)+" 의 국영수 점수를 입력하세요. :");
					for (int j = 0; j < 3; j++) {
						int score = sc.nextInt();
						arry[i][j] = score;

					}
				}
			}

			if (menu == 2) {
				for (int i = 0; i < 3; i++) {
					System.out.print("학생 " + (i + 1) + " : ");

					for (int j = 0; j < 3; j++) {

						System.out.print(arry[i][j] + "점 ");
						sum += arry[i][j];
					}

					avg = Double.parseDouble(String.format("%.2f", (double) sum / 3));
					System.out.println(" 총점은 " + sum + " 평균은 " + avg);
					sum = 0;

				}
				double kor = 0, eng = 0, math = 0;
				for (int i = 0; i < 3; i++) {
					kor += arry[i][0];
					eng += arry[i][1];
					math += arry[i][2];
				}
				System.out.println("\n국어 평균 : " + (kor / 3) + " 영어 평균 : " + (eng / 3) + " 수학 평균 : " + (math / 3)+"\n");
			}
		}
		System.out.println("종료합니다");

	}

}
