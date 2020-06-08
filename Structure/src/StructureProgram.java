import java.util.Scanner;

public class StructureProgram {

	static Scanner scan = new Scanner(System.in);
	static int[] kors = new int[3];
	static int total = 0;
	static float avg;

	public static void main(String[] args) {

		int menu;
		boolean keepLoop = true;

		while (keepLoop) {
			System.out.println("┌───────────────────────────┐");
			System.out.println("│           메인 메뉴       │");
			System.out.println("└───────────────────────────┘");
			System.out.println("\t1. 성적입력 ");
			System.out.println("\t2. 성적출력 ");
			System.out.println("\t3. 종료 ");
			System.out.println("\t선택> ");
			menu = scan.nextInt();

			switch (menu) {
			case 1:

				Grade.inputGrade(kors);

				break;
			case 2:

				print(kors);

				break;
			case 3:
				System.out.println("Bye~~");

				keepLoop = false;
				break;

			default:
				System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
			}
		}
		scan.close();
	}

	static void print(int[] kors) {

		for (int i = 0; i < 3; i++)
			total += kors[i];

		avg = total / 3.0f;

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  출력      │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		for (int i = 0; i < 3; i++)
			System.out.printf("국어 %d : %3d\n", 3 - i, kors[i]);

		System.out.printf("총점 : %3d\n", total);
		System.out.printf("평균 : %6.2f\n", avg);
		System.out.println("─────────────────────────────");

	}

}

class Grade {
	static void inputGrade(int[] kors) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  입력      │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		for (int i = 0; i < 3; i++)
			do {
				System.out.printf("국어%d : ", i + 1);
				kors[i] = scan.nextInt();

				if (kors[i] < 0 || 100 < kors[i])
					System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

			} while (kors[i] < 0 || 100 < kors[i]);

		System.out.println("─────────────────────────────");

	}

};