package exam04;

public abstract class Phone { //�ϼ����� 
	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("on");
	}

	public void turnOff() {
		System.out.println("off");
	}
	public abstract void bell(); //�̿ϼ� Ŭ����
	
	
}
