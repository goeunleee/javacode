package exam02;

import java.util.HashSet;
import java.util.Set;

public class MemberEx {
	public static void main(String[] args) {
		
		Member m1 = new Member("이고은",24);
		Member m2 = new Member("김나리",25);
		Member m3 = new Member("김나리",25);
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		//이름, 나이 같으면 동일하게 나옴 memberclass 메소드 때문에 
		
		Set<Member> set = new HashSet<Member>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		for(Member m : set) {
			System.out.println(m); //이름과 나이가 같은거 들어가지 x x x  
		}
	}
}
