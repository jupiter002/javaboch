package ex0523;

import java.util.*;

public class ArryEx03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Date d = new Date();
		
		list.add("Hello");
		list.add(100);
		list.add(d);
		System.out.println(list);
		
//		String str = list.get(0)	// 받아올 값의 타입이 명확하지 않을때 오류남
		
		Object obj = list.get(0);	// list 안에 어떤 타입이 있는지 모를때 Object에 대입함.
		System.out.println(obj);
		
		list.add(0,100);
		System.out.println(list);
		
		
		
		ArrayList<String> list2 = new ArrayList();		//ArrayList의 타입을 제너릭<String>으로 지정해줬기 때문에
		list2.add("World");
		String s = list2.get(0);						//오류안남
		
		System.out.println(s);
		
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();		// <> 제너릭안에 타입은 참조형만 넣을것
		list3.add(100);
		int a = list3.get(0);
		System.out.println(a);
		
		
		
		
		
		
		
		
		
	}
	
}
