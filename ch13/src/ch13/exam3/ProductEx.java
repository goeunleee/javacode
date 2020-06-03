package ch13.exam3;

public class ProductEx {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
       Product<Tv, String> p1 = new Product<>();
       p1.setKind(new Tv());
       p1.setModel("smart Tv");
       Tv tv = p1.getKind();
       String s = p1.getModel(); 
	}
}
