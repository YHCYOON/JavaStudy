package scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNexCall() {
		System.out.println("������ ����� ���� ������ ��ȭ�� ���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ��ų�� ���� ���� ������ ��⿭�� �տ� �켱 ����մϴ�.");
	}

}