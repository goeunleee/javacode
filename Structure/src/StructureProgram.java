import java.util.Scanner;

public class StructureProgram {

	static Scanner scan = new Scanner(System.in);

	static int[][] student = new int[3][3]; // 국영수, 학생3명
	static int total[] = new int[3];
	static float avg[] = new float[3];

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

				Grade.inputGrade(student);

				break;
			case 2:

				print(student);

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

	static void print(int[][] student) {

		for (int i = 0; i < 3; i++) {
			total[0] += student[0][i];
			total[1] += student[1][i];
			total[2] += student[2][i];
		}

		avg[0] = total[0] / 3.0f;
		avg[1] = total[1] / 3.0f;
		avg[2] = total[2] / 3.0f;

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  출력      │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.println("학생 " + (i + 1) + "의 성적 ");
			System.out.printf("국어 : %3d , ", student[0][i]);
			System.out.printf("영어 : %3d , ", student[1][i]);
			System.out.printf("수학 : %3d\n", student[2][i]);
			System.out.println("────────────────────────────────────────────");
		}
		System.out.println("────────────────────────────────────────────");
		System.out.printf("국어총점 : %3d  │  ", total[0]);
		System.out.printf("국어평균 : %6.2f\n", avg[0]);
		System.out.printf("영어총점 : %3d  │  ", total[1]);
		System.out.printf("영어평균 : %6.2f\n", avg[1]);
		System.out.printf("수학총점 : %3d  │  ", total[2]);
		System.out.printf("수학평균 : %6.2f\n", avg[2]);
		System.out.println("────────────────────────────────────────────");
	}

}

class Grade {
	static void inputGrade(int[][] student) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  입력      │");
		System.out.println("└───────────────────────────┘");
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.printf("국어%d : ", i + 1);
			student[0][i] = scan.nextInt();
			System.out.printf("영어%d : ", i + 1);
			student[1][i] = scan.nextInt();
			System.out.printf("수학%d : ", i + 1);
			student[2][i] = scan.nextInt();

			if (student[0][i] < 0 || 100 < student[0][i])
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

			if (student[1][i] < 0 || 100 < student[1][i])
				System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");

			if (student[2][i] < 0 || 100 < student[2][i])
				System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");

		}

		System.out.println("─────────────────────────────");

	}

};