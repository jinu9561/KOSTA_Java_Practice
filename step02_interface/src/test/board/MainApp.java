package test.board;

public class MainApp {
	private BoardService boardService; // 필드를 이용한 다형성
	private Board board; // 필드를 이용한 다형성
	
	public MainApp() {
		// 1.QA
		System.out.println("----1.QA TEST 입니다--------");
		board = new QABoard(1, "java" , "진우" , "어렵다" , false);
		boardService = new QABoardServiceImpl();
		
		this.test(boardService, board);
		
		// 2.Upload
		System.out.println("----1.Upload TEST 입니다--------");
		board = new UploadBoard(2, "주말이다" , "민수" , "좋아용" , "a.jpg");
		boardService = new UploadBoardServiceImpl();
		
		this.test(boardService, board);

		// 2.Free
		System.out.println("----1.Free TEST 입니다--------");
		board = new FreeBoard(3, "다형성" , "뿌꾸" , "쉽지않음");
		boardService = new FreeBoardServiceImpl();
		
		this.test(boardService, board);
		
		
		
	}
	
	// 매개변수를 이용하는 다형성 (인수를 이용한 다형성)
	
	public void test(BoardService boardservice, Board board) {
		// 1. 등록
		int result = boardService.insert(board);
		
		// 2. 수정
		boolean b = boardservice.update(board);
		
		// 3. 검색
		Board searchBoard = boardservice.selectByBno(board.getBno());
		
		// 4 . 추가된 메소드 호출
		boardService.replyInsert();
		
		// 5. static 메소드 호출
		BoardService.selectAll(); // 구현객체없이 바로 접근 가능
		
	}
	
	public static void main(String[] args) {
		System.out.println("******Test Start***************");
		new MainApp();
		
	}
	
}
