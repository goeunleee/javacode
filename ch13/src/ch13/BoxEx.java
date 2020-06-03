package ch13;

public class BoxEx {

	public static void main(String[] args) {
		Box box = new Box();
		
		box.setObj("사과");
        System.out.println(box.getObj());
        
        box.setObj(500);
        System.out.println(box.getObj());
       
        Apple apple = new Apple();
        box.setObj(apple);
        System.out.println(box.getObj());
        
        Apple a = (Apple) box.getObj(); //형태에 맞게 타입캐스팅
        System.out.println(a);
        
	}

}
