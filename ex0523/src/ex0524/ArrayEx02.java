package ex0524;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayEx02 {
	public static void main(String[] args) {
		//객체생성
		ArrayList list = new ArrayList<>();
		
		
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(3);
		ArrayList list2 = new ArrayList<>(list.subList(1, 4));
		print(list,list2);

		Collections.sort(list);
		Collections.sort(list2);
		print(list,list2);
		
		
		list2.add("B");
		list2.add("C");
		print(list,list2);
		
		// set() : 수정 
		list2.set(3, "aa");
		print(list,list2);
		
		//list2에서 list에 포함된 객체들을 삭제
		
		for(int i=5; i<0; i--) {
			if(list.contains(list2.get(i))) {
				list2.remove(i);
			}
		
		}
		print(list,list2);
	}
	
	
	static void print(ArrayList list, ArrayList list2) {
		System.out.println("list : "+list);
		System.out.println("list2 : "+list2);
	}
	}