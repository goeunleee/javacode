package ch03.operator;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int x=7; int y = 1010;
        x ++; 
        System.out.println("x is "+x+"  y is "+y);
        System.out.println(Integer.toBinaryString(y));
        Scanner in = new Scanner(System.in);
       //x = in.nextInt();
        System.out.println(x);
        double z = y/x;
        System.out.println(z);
        System.out.println(Double.isFinite(z));
        System.out.println("jdk"+11);
        System.out.println("총점을 입력하세요 :");
        
        
        int sum = in.nextInt();
        String  grade = sum >= 80 ? "합격": "불합격";
        
       System.out.println(grade);
        //System.out.println(toBinaryString(y));
	}
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		return str;
        
	}

}
