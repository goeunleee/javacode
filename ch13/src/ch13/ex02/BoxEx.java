package ch13.ex02;

public class BoxEx {
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Box<String> box = new Box<>();
		box.setT("���1000��!");
		String s = box.getT(); //type casting �����൵ ok
		System.out.println(s);
		
		Box<Integer> box2 = new Box<>();
		box2.setT(200);
		int apple = box2.getT(); 
		System.out.println(apple);
	}
}
