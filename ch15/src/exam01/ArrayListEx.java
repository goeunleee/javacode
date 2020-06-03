package exam01;


import java.util.*;

public class ArrayListEx {
	@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	public static void main(String[] args) {
         ArrayList<String> li = new ArrayList<>();
         li.add("°íÀº");
         li.add("ÀÚµÎ");
         li.add("µş±â");
         li.add("Å°À§");
         li.add("Æ÷µµ");
         
         System.out.println(li);
         System.out.println(li.size());
         System.out.println(li.get(2));
         
         li.add(1,"±Ö");
         System.out.println(li.get(1));
         li.remove(5);
         System.out.println(li);
         
         li.remove("±Ö");
         System.out.println(li);
         
         
         List li2 = new Vector<String>();
         li2.add("ÇÇ¸Á");
         li2.add("ÆÄ½ºÅ¸¸é");
         li2.add("Ä³Ã¸");
         li2.add("°è¶õ");
         li2.add("¼Ò¼¼Áö");
         li2.add("¾çÆÄ");
         System.out.println(li2.size());
         System.out.println(li2);
         li2.add(5,"µş±âÀë");
         System.out.println(li2);
         li2.remove("µş±âÀë");
         System.out.println(li2);
         
	}
}
