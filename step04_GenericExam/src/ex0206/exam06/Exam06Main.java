package ex0206.exam06;

public class Exam06Main {
	public static void main(String[] args) {
		Course course = new Course();
		course.register(new Applicant<Person>(new Person()));
		course.register(new Applicant<Worker>(new Worker()));
		course.register(new Applicant<Student>(new Student()));
		course.register(new Applicant<HighStudent>(new HighStudent()));
		course.register(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		System.out.println("-----------------------------------------------");
		
		course.registerWorker(new Applicant<Person>(new Person()));
		course.registerWorker(new Applicant<Worker>(new Worker()));
//		course.registerWorker(new Applicant<Student>(new Student()));
//		course.registerWorker(new Applicant<HighStudent>(new HighStudent()));
//		course.registerWorker(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		System.out.println("-----------------------------------------------");

		course.registerStudent(new Applicant<Person>(new Person()));
//		course.registerStudent(new Applicant<Worker>(new Worker()));
		course.registerStudent(new Applicant<Student>(new Student()));
//		course.registerStudent(new Applicant<HighStudent>(new HighStudent()));
//		course.registerStudent(new Applicant<MiddleStudent>(new MiddleStudent()));
		
	}
}
