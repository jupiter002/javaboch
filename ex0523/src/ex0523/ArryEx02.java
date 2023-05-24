package ex0523;

import java.util.ArrayList;

public class ArryEx02 {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();		//기본생성자
//			//매개변수 int인 생성자, 크기 설정 넣는대로 데이터가 들어가기 때문에 상관없음
//		System.out.println(list2.size());
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		ArrayList list2 = new ArrayList(list1);	//list1의 값 복사해서 생성
		System.out.println(list2);
		System.out.println(list1);
		
		
		
		
		
		
		
		
		
		
		
	}
}
