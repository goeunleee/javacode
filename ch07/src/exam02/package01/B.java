package exam02.package01;

public class B {
	public void method() {
		A a = new A(); //같은 패키지 내에서 protected 호출 가능 
		a.field = "value";
		a.method();
	}
}
