package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
/*		for( int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);	// i번째 객체를 불러옴	
			int tempId = member.getMemberId();	// 객체의 MemberId 값을 가져옴
			if( memberId == tempId) {
				arrayList.remove(i);
				return true;
			}
		}
*/
		
		// List 와 달리 Set은 인덱스 순서가 정해져있지 않아서 iterator 로 순회해야함
		Iterator<Member> iterator = arrayList.iterator();
		while( iterator.hasNext()) {		// iterator 다음에 가져올 값이 있으면
			Member member = iterator.next();
			int tempId = member.getMemberId();	// 객체의 MemberId 값을 가져옴
			if( memberId == tempId) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
/*		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println(arrayList);
*/		
		Iterator<Member> iterator = arrayList.iterator();
		while ( iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member);
		}
		System.out.println(arrayList);
		
	}
}
