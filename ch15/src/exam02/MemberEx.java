package exam02;

import java.util.HashSet;
import java.util.Set;

public class MemberEx {
	public static void main(String[] args) {
		
		Member m1 = new Member("�̰���",24);
		Member m2 = new Member("�質��",25);
		Member m3 = new Member("�質��",25);
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		//�̸�, ���� ������ �����ϰ� ���� memberclass �޼ҵ� ������ 
		
		Set<Member> set = new HashSet<Member>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		for(Member m : set) {
			System.out.println(m); //�̸��� ���̰� ������ ���� x x x  
		}
	}
}
