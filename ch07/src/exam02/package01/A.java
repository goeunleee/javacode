package exam02.package01;

public class A {
	protected String field;

	protected A() {
      
	}

	protected void method() {
	}
	public static void main(String[] args) {
		A a = new A();
		a.field = "afield";
		System.out.println(a.field);
	}
}
