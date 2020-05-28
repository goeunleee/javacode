package ch03.operator;

import java.util.Scanner;

public class Swca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rand = (int)(Math.random()*10)+1;
		System.out.println(rand);
		int cnt = 0;
		Scanner in = new Scanner(System.in);
		while(cnt < 10) {
			System.out.println((cnt+1)+"번째 시도 : \n");
			int input = in.nextInt();
			if(input > rand)
				System.out.println("Down");
			if(input<rand)
				System.out.println("Up");
			if (input ==rand) {
				System.out.println("정답입니다.");
				break;
			}
			
			}
			cnt++;
		}

	}

