package exam02;

public class Student {
	public int sid;
	public String name;

	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

        if(obj instanceof Student) {
        	Student stu = Student(obj);
		return sid == stu.sid && name.equals(stu.name);
        	}
        else
        	return false;
	}

	
	private Student Student(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}

}
