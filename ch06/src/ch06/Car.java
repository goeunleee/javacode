package ch06;

import java.util.Scanner;

public class Car { // public class = ���� �̸��� �����ؾ� !!
	Scanner sc = new Scanner(System.in);
	String model, owner;
	int speed;
	int liter;
	int num;
	static int mynum = 0;

	public Car(String model, String owner, int speed) {
		model = this.model;
		owner = this.owner;
		speed = this.speed;
		
		num = ++mynum;
	}
// 
	void refuel(int oil) {
		liter += oil;
	}

	void setSpeed() {
		System.out.println("�ӵ� �Է� : ");
		speed = sc.nextInt();
	}

	void setOwner() {
		System.out.println("���� �Է� : ");
		owner = sc.nextLine();
	}

	void setModel() {
		System.out.println("���̸� �Է� : ");
		model = sc.nextLine();
	}

}
