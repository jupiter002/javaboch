package ex0524;
import java.util.*;


public class SetEx01 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add("hello");
		hs.add(7);
		
		Date d = new Date();
		Date d2 = new Date();
		
		hs.add(d);			// 값이 들어갈때 같은 날짜인지 확인하고ㅓ 같아서 하나만 들어간것. (중복 허용 안함)
		hs.add(d2);
		hs.add(7);
		System.out.println(hs);
		
		Best b = new Best();
		Best b2 = new Best();
		
		System.out.println(b.toString());
		System.out.println(b2.toString());
		
		
		hs.add(new Best());
		hs.add(new Best());
		hs.add(new Best());
		
		System.out.println(hs);
	}
}

class Best{
	
}