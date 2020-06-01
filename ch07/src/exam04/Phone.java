package exam04;

public abstract class Phone { //¿Ï¼º´úµÊ 
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
	public abstract void bell(); //¹Ì¿Ï¼º Å¬·¡½º
	
	
}
