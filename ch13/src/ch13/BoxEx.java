package ch13;

public class BoxEx {

	public static void main(String[] args) {
		Box box = new Box();
		
		box.setObj("���");
        System.out.println(box.getObj());
        
        box.setObj(500);
        System.out.println(box.getObj());
       
        Apple apple = new Apple();
        box.setObj(apple);
        System.out.println(box.getObj());
        
        Apple a = (Apple) box.getObj(); //���¿� �°� Ÿ��ĳ����
        System.out.println(a);
        
	}

}
