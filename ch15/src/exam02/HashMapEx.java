package exam02;
import java.util.HashMap;
import java.util.Map;
public class HashMapEx {

	public static void main(String[] args) {
		Map<Student,Integer> mp = new HashMap<>();
		mp.put(new Student(1,"�̰���"),100);
		mp.put(new Student(1,"�̰���"),100);
		mp.put(new Student(2, "����"),90);
		mp.put(new Student(3, "����ġ"),80);
		
		System.out.println(mp.size());

	}

}
