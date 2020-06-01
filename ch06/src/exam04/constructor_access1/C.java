package exam04.constructor_access1;

import exam04.constructor_access.A;

public class C {
	A a1 = new A(true); // public은 다른 패키지 생성자 호출 가능
	// A a2 = new A(1); //default 다른 패키지에서 사용 불가
	// A a3 = new A("문자열"); //private 사용 불가
	
	
}
