package ex0206.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ex0206.list.Emp;

public class StudentServiceImpl implements StudentService { // 여기 완성해오기
	
	private ArrayList<Student> list = new ArrayList<Student>();
	
	/**
	 * 초기치 데이터 5명의 정보를 저장
	 * */
	public StudentServiceImpl() {
		list.add(new Student("A01", "희정", 20, "서울"));
		list.add(new Student("A02", "나영", 25, "대구"));
		list.add(new Student("A03", "효리", 22, "부산"));
		list.add(new Student("A04", "민아", 21, "경기"));
		list.add(new Student("A05", "선경", 20, "서울"));
	}

	@Override
	public boolean insert(Student st) {
		for(Student s : list) {
			if(s.getSno().equals(st.getSno())) {
				System.out.println("이미 등록된 학생입니다!");
				return false;
			} 
		}
		list.add(st);
		return true;
		
	}

	@Override
	public List<Student> selectAll() {
		List<Student> shallowCopyList = new ArrayList<Student>(list);
		
		return shallowCopyList;
	}

	@Override
	public Student selectBySno(String sno) {
		for(Student s : list) {
			if(s.getSno().equals(sno)) {
				return s;
			}
		}
		return null;
	}

	@Override
	public boolean delete(String sno) {
		for(Student s : list) {
			if(s.getSno().equals(sno)) {
				list.remove(s);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean update(Student student) {
		for(Student s : list) {
			if(s.getSno().equals(student.getSno())) {
				s.setAge(student.getAge());
				s.setAddr(student.getAddr());
				return true;
			} 
		}
		return false;
		
	}

	@Override
	public List<Student> sortByAge() {
		List<Student> shallowCopyList = new ArrayList<Student>(list);
		
		Collections.sort(shallowCopyList);
		
		return shallowCopyList;
	}
	
//	@Override
//	public List<Student> sortByAge() { // 다른 방법
//		List<Student> shallowCopyList = new ArrayList<Student>(list);
//		
//		Collections.sort(shallowCopyList, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o2.getAge() - o1.getAge();
//			}
//		});
//		
//		return shallowCopyList;
//	}
}
