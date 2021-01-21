package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		boolean b1 = set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(b1);
		System.out.println(set);
		
		boolean b2 = set.add("ccc");	//중복을 허용하지 않기때문에 안들어감 false
		
		System.out.println(b2);
		System.out.println(set);
	}

}
