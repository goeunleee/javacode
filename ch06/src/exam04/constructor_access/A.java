package exam04.constructor_access;

public class A {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");

	public A(boolean b) {

	}
  // 버팔로떼한테 치이는 기분이다 
	A(int i) { // default

	}

	private A(String string) {

	}

} 

class B {
	A a4 = new A(true); // public 모든 클래스에서 접근 가능
	A a5 = new A(1); // default 동일 패키지 내 접근 가능
	// A a6 = new A("문자열"); //private 외부클래스에서 접근 불가능
}
