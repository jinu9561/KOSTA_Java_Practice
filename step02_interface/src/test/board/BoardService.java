package test.board;

// 모든 게시판이 공통으로 사용하게 될 메소드 정의(규격서)

public interface BoardService {
	// 등록하기
	// @return : 0이면 실패, 1이상이면 등록성공
	// @param : QABoard or UploadBoard or FreeBoard 전달
	int insert(Board board); // QABoard, UploadBoard, FreeBoard
	
	// 수정하기(글번호에 해당하는 제목, 내용을 수정한다.
	// @return : true 면 수정완료 false면 실패
	// @param : QABoard or UploadBoard or FreeBoard 전달
	boolean update(Board board);
	
	// 글번호에 해당하는 게시물 조회하기
	// @param : 글번호
	// @return : 조회된  QABoard or UploadBoard or FreeBoard 리턴
	//			 조회된 결과가 없으면 null 리턴
	
	Board selectByBno(int bno);
	
	default void replyInsert() {
		System.out.println("BoardService replyInsert()입니다...");
	}
	
	static void selectAll() {
		System.out.println("BoardService selectAll()입니다...");
	}
	
	
	
}
