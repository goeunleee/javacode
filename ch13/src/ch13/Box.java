package ch13;

public class Box {
	@SuppressWarnings("unused")
	private Object obj;// object 타입은 모든 타입의 부모 타입

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}
