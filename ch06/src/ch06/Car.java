package ch06;

import java.util.Scanner;

public class Car { // public class = 파일 이름과 동일해야 !!
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
		System.out.println("속도 입력 : ");
		speed = sc.nextInt();
	}

	void setOwner() {
		System.out.println("차주 입력 : ");
		owner = sc.nextLine();
	}

	void setModel() {
		System.out.println("모델이름 입력 : ");
		model = sc.nextLine();
	}

}
