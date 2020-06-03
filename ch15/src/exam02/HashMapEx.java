package exam02;
import java.util.HashMap;
import java.util.Map;
public class HashMapEx {

	public static void main(String[] args) {
		Map<Student,Integer> mp = new HashMap<>();
		mp.put(new Student(1,"이고은"),100);
		mp.put(new Student(1,"이고은"),100);
		mp.put(new Student(2, "리츠"),90);
		mp.put(new Student(3, "에이치"),80);
		
		System.out.println(mp.size());

	}

}
