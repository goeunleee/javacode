package ch03.operator;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int x=10; int y = 1010;
        x ++; 
        System.out.println("x is "+x+"  y is "+y);
        System.out.println(Integer.toBinaryString(y));
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        System.out.println(x);
        
        
        
        System.out.println(toBinaryString(y));
	}
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		return str;
        
	}

}
