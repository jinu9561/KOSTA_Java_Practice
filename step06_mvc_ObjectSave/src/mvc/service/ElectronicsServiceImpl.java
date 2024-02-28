package mvc.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ResourceBundle;

import mvc.dto.Electronics;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

/**
 * 전자제품에 관련된 기능을 담당할 클래스
 *  : 싱글톤 클래스로 만든다.
 *  	(private 생성자, 자기 자신 멤버에서 생성, 현재 객체르 리천하는 static 메소드 제공
 */

public class ElectronicsServiceImpl implements ElectronicsService {
	
	private static ElectronicsService instance = new ElectronicsServiceImpl(); 
    private static final int MAX_SIZE=10;
    List<Electronics> list = new ArrayList<Electronics>();
    
    /** 
     * 외부에서 객체 생성안됨. 
     * InitInfo.properties파일을 로딩하여  List에 추가하여
     * 초기치 데이터를 만든다.
     * 
     */
    
    private ElectronicsServiceImpl() {
    	
    	// save.txt문서가 존재하는지 체크한후
    	// 없으면 ResourceBundle을 이용하여
    	// list에 데이터를 저장한다.
    	// 만약 있으면 save.txt에 있는 파일을
    	// 로딩하여 list를 복원한다.
    	
    	File file = new File("src/mvc/save.txt");
    	
    	if(file.exists()) {
    		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
        	    list = (List<Electronics>) ois.readObject(); 
        	    System.out.println("save.txt 에서 저장돼있는 데이터: " + list);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	}
    }

    public static ElectronicsService getInstance() {
		return instance;
	}
    
	@Override
	public void insert(Electronics electronics) throws ElectronicsArrayBoundsException {
		
		if(list.size() <= MAX_SIZE) {
			for(Electronics e : list) {
				if(electronics.getModelNo() == e.getModelNo()) 
					throw new ElectronicsArrayBoundsException("모델번호가 중복이므로 등록 할 수 없습니다.");
			}
			
			list.add(electronics);			
			
		} else throw new ElectronicsArrayBoundsException("배열의 길이를 벗어나 더이상 등록 할수 없습니다.");
	}
	
	@Override
	public List<Electronics> selectAll() {
		return list;
	}

	@Override
	public Electronics searchByModelNo(int modelNo) throws SearchNotFoundException {
		for(Electronics e : list) {
			if(e.getModelNo() == modelNo) {
				// 찾았다
				return e;
			}
		}
		throw new SearchNotFoundException(modelNo + "는 없는 모델번호로 검색할수 없습니다.");
	}

	@Override
	public void update(Electronics electronics) throws SearchNotFoundException {
		for(Electronics e : list) {
			if(e.getModelNo() == electronics.getModelNo()) {
				e.setModelDetail(electronics.getModelDetail());
				return;
			}
		} 
		
		throw new SearchNotFoundException(electronics.getModelNo() + "는 없는 모델번호로 검색할수 없습니다.");
	}

	@Override
	public void delete(int modelNo) throws SearchNotFoundException {
		for(Electronics e : list) {
			if(e.getModelNo() == modelNo) {
				// 찾았다
				list.remove(e);
				return;
			}
		}
		throw new SearchNotFoundException(modelNo + "는 없는 모델번호로 검색할수 없습니다.");
	}

	@Override
	public List<Electronics> selectSortByPrice() {
		
		List<Electronics> sortedList = new ArrayList<Electronics>(list);
		
		Collections.sort(sortedList, (o1,o2) ->{
				return (o1.getModelPrice() - o2.getModelPrice()) 
						== 0 ? o1.getModelNo() - o2.getModelNo() : o1.getModelPrice() - o2.getModelPrice();
		}); // 람다식으로 정렬 메소드 만들기
		
//		Collections.sort(sortedList, new Comparator<Electronics>() {
//			@Override
//			public int compare(Electronics o1, Electronics o2) {
//				return (o1.getModelPrice() - o2.getModelPrice()) == 0 ? o1.getModelNo() - o2.getModelNo() : o1.getModelPrice() - o2.getModelPrice();
//			}
//		});
		
		return sortedList;
	}

	@Override
	public void saveObject() throws Exception { // 종료할때 저장하게 만들자
		// list를 save.txt 에 저장한다.
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/mvc/save.txt"))) {
			
			oos.writeObject(list);
			System.out.println("---- 저장완료! ----");
			
		} catch (Exception e) {
			throw e;
		}
		
	}

    
} // 클래스 끝 