package exam02;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class ClassMateTest {
	public static void main(String[] args) {
		List<ClassMate> classs = new LinkedList<>();

		classs.add(new ClassMate(11111, "�̰���"));
		classs.add(new ClassMate(11112, "����ġ"));
		classs.add(new ClassMate(11113, "��Ÿ��"));

		Collections.sort(classs);

		for (ClassMate m : classs)
			System.out.println(m);

		Collections.sort(classs, Collections.reverseOrder()); // ��������
		for (ClassMate m : classs)
			System.out.println(m);
	}

}
