package exam01;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class LinkedListEX {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		List<String> li = new ArrayList<>();
		List li2 = new LinkedList<String>();

		long startTime, endTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			li.add(0,String.valueOf(i));

		}endTime = System.nanoTime();
		System.out.println(endTime-startTime);
        
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			li2.add(0,String.valueOf(i));

		}endTime = System.nanoTime();
		System.out.println(endTime-startTime);
	}
}
