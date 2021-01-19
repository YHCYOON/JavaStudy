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
			Member member = arrayList.get(i);	// i��° ��ü�� �ҷ���	
			int tempId = member.getMemberId();	// ��ü�� MemberId ���� ������
			if( memberId == tempId) {
				arrayList.remove(i);
				return true;
			}
		}
*/
		
		// List �� �޸� Set�� �ε��� ������ ���������� �ʾƼ� iterator �� ��ȸ�ؾ���
		Iterator<Member> iterator = arrayList.iterator();
		while( iterator.hasNext()) {		// iterator ������ ������ ���� ������
			Member member = iterator.next();
			
			int tempId = member.getMemberId();	// ��ü�� MemberId ���� ������
			if( memberId == tempId) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
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