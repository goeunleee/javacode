package exam03;

public class PromoteEx {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
         A a = new A();
         A ab = new B();
        
         A ac = new C();
         A ad = new D();
         A ae = new E();
         
         B b = (B) ab;
         ab.aa = "abValue";
         B bd = new D();
         b.aa = "BValue";
         b.method();
         bd.method();
         D d = new D();
         
         if (ac instanceof A) {
        	 System.out.println("A °´Ã¼");
         }else 
        	 System.out.println("¾Æ´ÏÁö·Õ");
         
	}
}
