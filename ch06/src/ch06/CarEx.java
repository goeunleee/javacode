package ch06;

public class CarEx {

	public static void main(String[] args) {
		Car c1 = new Car("B사","이고은",100);
		  System.out.println(c1.model+","+c1.owner+","+c1.speed+" number : "+c1.num);
		c1.setModel();
        c1.setOwner();
        c1.setSpeed();
        c1.refuel(10);
        System.out.println(c1.model+","+c1.owner+","+c1.speed+" ,number : "+c1.num);
		

	}

}
