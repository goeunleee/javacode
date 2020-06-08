import java.util.Scanner;

public class StructureProgram {

	static Scanner scan = new Scanner(System.in);

	static int[][] student = new int[3][3]; // ������, �л�3��
	static int total[] = new int[3];
	static float avg[] = new float[3];

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
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �޴��� 1~3�����Դϴ�.");
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

		System.out.println("����������������������������������������������������������");
		System.out.println("��           ����  ���      ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.println("�л� " + (i + 1) + "�� ���� ");
			System.out.printf("���� : %3d , ", student[0][i]);
			System.out.printf("���� : %3d , ", student[1][i]);
			System.out.printf("���� : %3d\n", student[2][i]);
			System.out.println("����������������������������������������������������������������������������������������");
		}
		System.out.println("����������������������������������������������������������������������������������������");
		System.out.printf("�������� : %3d  ��  ", total[0]);
		System.out.printf("������� : %6.2f\n", avg[0]);
		System.out.printf("�������� : %3d  ��  ", total[1]);
		System.out.printf("������� : %6.2f\n", avg[1]);
		System.out.printf("�������� : %3d  ��  ", total[2]);
		System.out.printf("������� : %6.2f\n", avg[2]);
		System.out.println("����������������������������������������������������������������������������������������");
	}

}

class Grade {
	static void inputGrade(int[][] student) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("����������������������������������������������������������");
		System.out.println("��           ����  �Է�      ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.printf("����%d : ", i + 1);
			student[0][i] = scan.nextInt();
			System.out.printf("����%d : ", i + 1);
			student[1][i] = scan.nextInt();
			System.out.printf("����%d : ", i + 1);
			student[2][i] = scan.nextInt();

			if (student[0][i] < 0 || 100 < student[0][i])
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

			if (student[1][i] < 0 || 100 < student[1][i])
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

			if (student[2][i] < 0 || 100 < student[2][i])
				System.out.println("���м����� 0~100������ ������ �Է��� �����մϴ�.");

		}

		System.out.println("����������������������������������������������������������");

	}

};