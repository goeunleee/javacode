package exam05;

import java.util.StringTokenizer;

public class StringSplitEx {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String s = "이고은&박수민,미도리,카나타-치아키";
		String[] res = "이고은&박수민,미도리,카나타-치아키".split("&|,|-|");

		for (String s2 : res) {
			System.out.print(s2+"");
		} 
		System.out.println("\n");
		
		String text = "미도리/치아키/카나타/테토라/시노부/이고은";
		StringTokenizer st = new StringTokenizer(text,"/");
		
		int cntTokens = st.countTokens();
		System.out.println("토큰개수 : "+cntTokens);
		for(int i = 0; i< cntTokens; i++) {
			String token = st.nextToken();
			System.out.print(token+" ");
		}
		
	}

}
