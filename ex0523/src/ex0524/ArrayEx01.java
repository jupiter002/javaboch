package ex0524;
import java.util.*;
public class ArrayEx01 {
	public static void main(String[] args) {
		//객체생성
		ArrayList<Integer> list = new ArrayList<>();
		
		
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(3);
//		System.out.println(list);
		
		list.subList(1, 4);			// sublist(from, to:미만)		=		index  1부터 4미만
		
		ArrayList<Integer> list2 = new ArrayList(list.subList(1, 4));
		System.out.println(list2);
		
		
		//정렬 : sort()
		Collections.sort(list);	// 오름차순 정렬
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		
		//contains(value)			// 특정 값이 없으면 false 있으면 true를 반환

		boolean a = list.contains(0);
		System.out.println(a);
		
		System.out.println(list.contains(list2));	//list의 값들이 list2에 있는지 확인
		
		//retain()교집합만 남기고 나머지 값 삭제
		//retainAll()
		list.retainAll(list2);
		System.out.println(list);
		System.out.println(list2);
		
		
		
				
	}
	

}	
