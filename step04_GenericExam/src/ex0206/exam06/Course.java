package ex0206.exam06;
// ��û��(���, ������, �л�, ���, �ߵ�)�� ������ ��û�ϴ� Ŭ����
public class Course {
	// ��� ����� ���
	public void register(Applicant<?> applicant) {
		System.out.println(applicant.getKind().getClass().getSimpleName() + "�� ��û�Ǿ����ϴ�.");
	}
	
	// �����θ� ���
	public void registerWorker(Applicant<? super Worker> applicant) {
		System.out.println(applicant.getKind().getClass().getSimpleName() + "�� ��û�Ǿ����ϴ�.");
	}
	
	// �л��� ���
	public void registerStudent(Applicant<? super Student> applicant) {
		System.out.println(applicant.getKind().getClass().getSimpleName() + "�� ��û�Ǿ����ϴ�.");
	}
}
