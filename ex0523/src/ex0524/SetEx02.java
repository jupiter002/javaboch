package ex0524;
import java.util.*;

public class SetEx02 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("a");
		ts.add("b");
		
		System.out.println(ts);
		ts.add("F");
		ts.add("A");
		
		System.out.println(ts);
		ts.add("D");
		ts.add("W");
		ts.add("K");
		System.out.println(ts);
	}
}
