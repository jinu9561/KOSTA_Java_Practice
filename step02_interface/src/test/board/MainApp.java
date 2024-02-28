package test.board;

public class MainApp {
	private BoardService boardService; // �ʵ带 �̿��� ������
	private Board board; // �ʵ带 �̿��� ������
	
	public MainApp() {
		// 1.QA
		System.out.println("----1.QA TEST �Դϴ�--------");
		board = new QABoard(1, "java" , "����" , "��ƴ�" , false);
		boardService = new QABoardServiceImpl();
		
		this.test(boardService, board);
		
		// 2.Upload
		System.out.println("----1.Upload TEST �Դϴ�--------");
		board = new UploadBoard(2, "�ָ��̴�" , "�μ�" , "���ƿ�" , "a.jpg");
		boardService = new UploadBoardServiceImpl();
		
		this.test(boardService, board);

		// 2.Free
		System.out.println("----1.Free TEST �Դϴ�--------");
		board = new FreeBoard(3, "������" , "�Ѳ�" , "��������");
		boardService = new FreeBoardServiceImpl();
		
		this.test(boardService, board);
		
		
		
	}
	
	// �Ű������� �̿��ϴ� ������ (�μ��� �̿��� ������)
	
	public void test(BoardService boardservice, Board board) {
		// 1. ���
		int result = boardService.insert(board);
		
		// 2. ����
		boolean b = boardservice.update(board);
		
		// 3. �˻�
		Board searchBoard = boardservice.selectByBno(board.getBno());
		
		// 4 . �߰��� �޼ҵ� ȣ��
		boardService.replyInsert();
		
		// 5. static �޼ҵ� ȣ��
		BoardService.selectAll(); // ������ü���� �ٷ� ���� ����
		
	}
	
	public static void main(String[] args) {
		System.out.println("******Test Start***************");
		new MainApp();
		
	}
	
}
