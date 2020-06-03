package exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
       Set<String> set = new HashSet<String>();
       set.add("자두");
       set.add("수박");
       set.add("오렌지");
       
      System.out.println(set);
      set.add("양파");
      System.out.println(set);
      
      Object obj = new Object();
      System.out.println(obj); //주소값
      
      System.out.println(obj.hashCode());
      System.out.println(Integer.toHexString(obj.hashCode())); //obj객체 해시코드를 16진수로 출력 -> 주소값과 동일하다는 것을 알 수 있다.
      
	}
}
