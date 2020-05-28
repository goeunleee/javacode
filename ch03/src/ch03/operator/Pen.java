package ch03.operator;
import java.math.*;
public class Pen {

	public static void main(String[] args) {
		int pencil = 356;
		int student =  30;
		System.out.println("1명당 "+pencil/student+" 개의 연필");
		System.out.println(pencil%student+" 개의 연필이 남음");
		int cd =(int)Math.random()*114+1;
        System.out.println(cd);
        int sum =0;
        for(int i = 0; i<10 ; i++) {
        	System.out.println("사과");
        	sum += 1;
        }
        System.out.println("사과는 "+sum+"개");
	}

}
