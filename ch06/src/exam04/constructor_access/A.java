package exam04.constructor_access;

public class A {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("���ڿ�");

	public A(boolean b) {

	}
  // ���ȷζ����� ġ�̴� ����̴� 
	A(int i) { // default

	}

	private A(String string) {

	}

} 

class B {
	A a4 = new A(true); // public ��� Ŭ�������� ���� ����
	A a5 = new A(1); // default ���� ��Ű�� �� ���� ����
	// A a6 = new A("���ڿ�"); //private �ܺ�Ŭ�������� ���� �Ұ���
}
