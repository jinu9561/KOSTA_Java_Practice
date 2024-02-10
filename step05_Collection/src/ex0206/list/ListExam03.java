package ex0206.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExam03 {
	List<Emp> list = new ArrayList<Emp>();
	
	public ListExam03() {
		// list 에 사원 5명 추가
		list.add(new Emp(14485, "진우", 28, "서울"));
		list.add(new Emp(63234, "진수", 21, "대구"));
		list.add(new Emp(53126, "진구", 78, "코펜하겐"));
		list.add(new Emp(53687, "진호", 128, "캘리포니아"));
		list.add(new Emp(36685, "진주", 2, "코펜하겐"));
		
//		System.out.println(list);
		
		for(Emp e : list) {
			System.out.println(e);
		}
	}
	
	// 이름에 해당하는 사원 정보 검색 (전제조건: 이름 중복 안됨)
	public Emp selectByName(String name) {
		for(Emp e : list) {
			if(e.getEname().equals(name)) {
				return e;
			}
		}
		return null;
	}
	
	// 주소에 해당하는 사원 정보 검색 (전제조건: 주소 중복 가능)
		public List<Emp> selectByAddr(String addr) {
			List<Emp> searchList = new ArrayList<Emp>();
			
			for(Emp e : list) {
				if(e.getAddr().equals(addr)) {
					searchList.add(e);
				}
			}
			return searchList;
		}
	
	// 사원번호를 기준으로 정렬한 결과 리턴
	public List<Emp> sortByEmpno(){
		List<Emp> shallowCopyList = new ArrayList<Emp>(list); // list의 카피본을 만듦
//		System.out.println("정렬전 : ");
		
		Collections.sort(shallowCopyList);
		
		return shallowCopyList;
	}
	
	public static void main(String[] args) {
		ListExam03 list = new ListExam03();
		
		System.out.println("---1.이름으로 검색---");
		System.out.println(list.selectByName("진수"));
		System.out.println(list.selectByName("진철"));
		
		System.out.println("---2.주소로 검색----");
		List<Emp> searchList = list.selectByAddr("코펜하겐");
		
		if(searchList.isEmpty()) {
			System.out.println("그런주소없다");
		} else {
			for(Emp e : searchList) {
				System.out.println(e + " ");
			}
		}
		
		System.out.println("\n3. 정렬연습----");
		List<Emp> sortResult = list.sortByEmpno();
		for(Emp emp : sortResult) {
			System.out.println(emp);
		}
		
	}
	

}
