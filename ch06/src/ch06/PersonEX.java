package ch06;

class Person {

	final String nation = "korea";
	final String ssn;
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;

	}
}

public class PersonEX {

	public static void main(String[] args) {
		Person p1 = new Person("123", "고은");
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);

		p1.name = "수민";
		// p1.nation = "france"; //final 값 수정 불가능
		System.out.println(p1.name);
		System.out.println(p1.nation);

	}

}
