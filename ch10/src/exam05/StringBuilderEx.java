package exam05;

public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		sb.append("java");
		sb.append(" program study");
		System.out.println(sb.toString());
		System.out.println(sb); // toString 생략 가능

		sb.insert(4, "2");
		System.out.println(sb);
		sb.replace(6, 13, "goeun");
		System.out.println(sb);
		
	}
}//