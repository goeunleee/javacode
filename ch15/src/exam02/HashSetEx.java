package exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
       Set<String> set = new HashSet<String>();
       set.add("�ڵ�");
       set.add("����");
       set.add("������");
       
      System.out.println(set);
      set.add("����");
      System.out.println(set);
      
      Object obj = new Object();
      System.out.println(obj); //�ּҰ�
      
      System.out.println(obj.hashCode());
      System.out.println(Integer.toHexString(obj.hashCode())); //obj��ü �ؽ��ڵ带 16������ ��� -> �ּҰ��� �����ϴٴ� ���� �� �� �ִ�.
      
	}
}
