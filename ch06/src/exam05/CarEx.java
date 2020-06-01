package exam05;

class Car {
	private int speed;
	private boolean stop;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else
			this.speed = speed;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

	@Override // 어노테이션
	public String toString() {
		return "Car [speed=" + speed + ", stop=" + stop + "]";
	}

}

public class CarEx {
	public static void main(String[] args) {

		Car mycar = new Car();
		mycar.setSpeed(27);

		System.out.println("현재 속도 : " + mycar.getSpeed());

		if (!mycar.isStop())
			mycar.setStop(true);

		System.out.println("현재 속도 : " + mycar.getSpeed());

		System.out.println(mycar.toString());
	}
}
