package scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNexCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� ����մϴ�.");
	}

}
