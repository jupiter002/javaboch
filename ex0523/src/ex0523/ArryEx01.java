package ex0523;
import java.util.*;


public class ArryEx01 {
	public static void main(String[] args) {
		//객체생성
		ArrayList list = new ArrayList();
		System.out.println(list);
		list.add(100);			// 추가하는 메서드
		list.add("Hello");
		System.out.println(list);
		
		list.add(100);
		list.add("hello");
		System.out.println(list);	// 순서 유지, 중복 허용

		Date d = new Date();
		list.add(d);
		System.out.println(list);	// 타입상관없음
		list.add(0,77);				//add(인덱스, 값) 0번 인덱스에 77을 넣음
		System.out.println(list);
		
		Object a = list.get(0);
		System.out.println(a);
		
		list.set(0, 700);
		System.out.println(list);	//set(인덱스, 값)수정 메서드 : 0번 인덱스에 값을 700으로 바꿈
		System.out.println(list.size());	//size(): 저장된 데이터의 길이를 출력하는 메서드
		
		list.remove(0);		// remove(인덱스) : 지정된 인덱스에 값을 제거
		System.out.println(list);
		
		list.clear();		//list() : 전체 값을 삭제
		System.out.println(list);
		
		
	}
}
