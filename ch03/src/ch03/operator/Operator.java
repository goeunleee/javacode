package ch03.operator;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int x=10; int y = 1010;
        x ++; 
        System.out.println("x is "+x+"  y is "+y);
        System.out.println(Integer.toBinaryString(y));
        
        System.out.println(toBinaryString(y));
	}
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		return str;
		
	}

}
