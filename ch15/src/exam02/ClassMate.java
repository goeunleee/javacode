package exam02;

public class ClassMate implements Comparable<ClassMate> {

	int sid;
	String name;

	@Override
	public int compareTo(ClassMate arg0) {
		 return name.compareTo(arg0.name); //이름순서로
		//return sid - arg0.sid;
		// 두 객체 비교해서 같으면 0 작으면 음수 크면 양수 반환
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
