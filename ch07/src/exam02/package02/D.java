package exam02.package02;

import exam02.package01.A;

public class D extends A{
   private int d;

public D(int d ) { // 디폴트 생성자
	   super(); //상속받음
	   this.field = "dvalue";
	   this.method(); //상속 관계에서 protected 호출 가능!!!
	   this.d = d;
   }
	
     public static void main(String[] args) {
		D d = new D(7);
		System.out.println(d.field);
		System.out.println(d.d);
	}
}
