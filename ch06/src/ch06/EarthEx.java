package ch06;

class Earth {
	static final double Earth_Radius = 6400;
	static final double Earth_Surface_Area;

	static {
		Earth_Surface_Area = 4 * Math.PI * Earth_Radius * Earth_Radius;
	}
}

public class EarthEx {

	public static void main(String[] args) {
		System.out.println("������ ������ : " + Earth.Earth_Radius + "��");
		System.out.println("������ ǥ���� : " + Earth.Earth_Surface_Area + "��");

	}

}
