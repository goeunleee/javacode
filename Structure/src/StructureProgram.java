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
			System.out.println("����������������������������������������������������������");
			System.out.println("��           ���� �޴�       ��");
			System.out.println("����������������������������������������������������������");
			System.out.println("\t1. �����Է� ");
			System.out.println("\t2. ������� ");
			System.out.println("\t3. ���� ");
			System.out.println("\t����> ");
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
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �޴��� 1~3�����Դϴ�.");
			}
		}
		scan.close();
	}

	static void print(int[] kors) {

		for (int i = 0; i < 3; i++)
			total += kors[i];

		avg = total / 3.0f;

		System.out.println("����������������������������������������������������������");
		System.out.println("��           ����  ���      ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		for (int i = 0; i < 3; i++)
			System.out.printf("���� %d : %3d\n", 3 - i, kors[i]);

		System.out.printf("���� : %3d\n", total);
		System.out.printf("��� : %6.2f\n", avg);
		System.out.println("����������������������������������������������������������");

	}

}

class Grade {
	static void inputGrade(int[] kors) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("����������������������������������������������������������");
		System.out.println("��           ����  �Է�      ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		for (int i = 0; i < 3; i++)
			do {
				System.out.printf("����%d : ", i + 1);
				kors[i] = scan.nextInt();

				if (kors[i] < 0 || 100 < kors[i])
					System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

			} while (kors[i] < 0 || 100 < kors[i]);

		System.out.println("����������������������������������������������������������");

	}

};