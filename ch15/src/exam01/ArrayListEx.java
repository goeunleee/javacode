package exam01;


import java.util.*;

public class ArrayListEx {
	@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	public static void main(String[] args) {
         ArrayList<String> li = new ArrayList<>();
         li.add("����");
         li.add("�ڵ�");
         li.add("����");
         li.add("Ű��");
         li.add("����");
         
         System.out.println(li);
         System.out.println(li.size());
         System.out.println(li.get(2));
         
         li.add(1,"��");
         System.out.println(li.get(1));
         li.remove(5);
         System.out.println(li);
         
         li.remove("��");
         System.out.println(li);
         
         
         List li2 = new Vector<String>();
         li2.add("�Ǹ�");
         li2.add("�Ľ�Ÿ��");
         li2.add("ĳø");
         li2.add("���");
         li2.add("�Ҽ���");
         li2.add("����");
         System.out.println(li2.size());
         System.out.println(li2);
         li2.add(5,"������");
         System.out.println(li2);
         li2.remove("������");
         System.out.println(li2);
         
	}
}
