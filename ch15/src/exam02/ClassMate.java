package exam02;

public class ClassMate implements Comparable<ClassMate> {

	int sid;
	String name;

	@Override
	public int compareTo(ClassMate arg0) {
		 return name.compareTo(arg0.name); //�̸�������
		//return sid - arg0.sid;
		// �� ��ü ���ؼ� ������ 0 ������ ���� ũ�� ��� ��ȯ
	}

	public ClassMate(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ClassMate [sid=" + sid + ", name=" + name + "]";

	}

}
