package ex0206.exam06;
// 신청자(사람, 직장인, 학생, 고딩, 중딩)가 과정을 신청하는 클래스
public class Course {
	// 모든 사람을 허용
	public void register(Applicant<?> applicant) {
		System.out.println(applicant.getKind().getClass().getSimpleName() + "가 신청되었습니다.");
	}
	
	// 직장인만 허용
	public void registerWorker(Applicant<? super Worker> applicant) {
		System.out.println(applicant.getKind().getClass().getSimpleName() + "가 신청되었습니다.");
	}
	
	// 학생만 허용
	public void registerStudent(Applicant<? super Student> applicant) {
		System.out.println(applicant.getKind().getClass().getSimpleName() + "가 신청되었습니다.");
	}
}
