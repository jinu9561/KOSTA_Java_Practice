package ex0130;

/**
 * 학생의 정보를 관리하는 서비스(등록, 수정, 검색...)
*/

public class StudentService {
	private Student stArr[] = new Student [5];
	private int count;
	
	// 초기치 데이터 3명정도 세팅하기
	
	public StudentService() {
		stArr[count++] = this.create("진우",28,"서울");
		stArr[count++] = this.create("덕춘",21,"애리조나");
		stArr[count++] = this.create("시온",102,"울릉도");
	}
	
	
	// Student 객체를 생성해서 리턴해주는 메소드 작성
	private Student create(String name, int age, String addr) {
		Student st = new Student(name,age,addr);
		
		return st;
	}
	
	// 학생의 정보 등록하기
	// 배열의 경계를 벗어나면 "더이상 추가 할 수 없습니다." 메세지 출력
	// 추가가 성공하면 "등록되었습니다". 메세지 출력
	
	public void insert(Student st) {
		// 배열방에 인수로 전달된 학생 정보를 추가한다.

		boolean flag = false;
		
		if(count < stArr.length) {
			
			for(int i = 0; i < count; i++) {
				if(stArr[i].getName().equals(st.getName())) {
					System.out.println("이미 등록된 학생입니다.");
					flag = true;
				}
			}
			if(flag == false) stArr[count++] = st;
			
			
		} else System.out.println("더이상 추가 할 수 없습니다.");
		
		
		
		
	}
	
	// 전체 학생의 정보 조회하기
	
	public void selectAll() {
		System.out.println("-------------전체 학생 정보 조회(" + count + "명)------------------");
		for(int i = 0; i < count; i++) {
			System.out.println("이름 : " + stArr[i].getName() + "\t");
			System.out.println("나이 : " + stArr[i].getAge() + "\t");
			System.out.println("주소 : " + stArr[i].getAddr());
			System.out.println();			
		}
	}
	
	// 이름에 해당하는 학생의 정보 검색하기
	
	public void selectByName(String name) {
		
		for(int i = 0; i < count; i++) {
			if(stArr[i].getName().equals(name)) {
				System.out.println("이름 : " + stArr[i].getName() + "\t");
				System.out.println("나이 : " + stArr[i].getAge() + "\t");
				System.out.println("주소 : " + stArr[i].getAddr());
				System.out.println();
				return;
			}  
		} System.out.println("존재하지 않는 학생입니다!");
		
	
	}
	
	// 이름에 해당하는 학생의 나이와 주소 변경하기
	// 이름에 해당하는 학생이 있는지 찾아서 없으면 "수정 할 수 없습니다." 출력
	// 있으면 수정하고 수정되었습니다 출력
	
	public void update(Student st) {
		st.getName();
		
		for(int i = 0; i < count; i++) {
			if(stArr[i].getName().equals(st.getName())) {
				stArr[i].setAddr(st.getAddr());
				stArr[i].setAge(st.getAge());
				
				System.out.println("수정되었습니다.");
				return;
			}
		}
		System.out.println("수정 할 수 없습니다.");
	}
	
}
