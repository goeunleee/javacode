package exam05;

import java.util.StringTokenizer;

public class StringSplitEx {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String s = "�̰���&�ڼ���,�̵���,ī��Ÿ-ġ��Ű";
		String[] res = "�̰���&�ڼ���,�̵���,ī��Ÿ-ġ��Ű".split("&|,|-|");

		for (String s2 : res) {
			System.out.print(s2+"");
		} 
		System.out.println("\n");
		
		String text = "�̵���/ġ��Ű/ī��Ÿ/�����/�ó��/�̰���";
		StringTokenizer st = new StringTokenizer(text,"/");
		
		int cntTokens = st.countTokens();
		System.out.println("��ū���� : "+cntTokens);
		for(int i = 0; i< cntTokens; i++) {
			String token = st.nextToken();
			System.out.print(token+" ");
		}
		
	}

}
