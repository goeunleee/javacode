package exam02.package02;

import exam02.package01.A;

public class D extends A{
   private int d;

public D(int d ) { // ����Ʈ ������
	   super(); //��ӹ���
	   this.field = "dvalue";
	   this.method(); //��� ���迡�� protected ȣ�� ����!!!
	   this.d = d;
   }
	
     public static void main(String[] args) {
		D d = new D(7);
		System.out.println(d.field);
		System.out.println(d.d);
	}
}
