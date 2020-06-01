package exam04;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void bell() { //추상 클래스에서 미완성된 메소드 여기서 완성
		System.out.println("전화왔지롱");
		
	}
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone(null);
		sp.bell();
	}

}