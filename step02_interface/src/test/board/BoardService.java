package test.board;

// ��� �Խ����� �������� ����ϰ� �� �޼ҵ� ����(�԰ݼ�)

public interface BoardService {
	// ����ϱ�
	// @return : 0�̸� ����, 1�̻��̸� ��ϼ���
	// @param : QABoard or UploadBoard or FreeBoard ����
	int insert(Board board); // QABoard, UploadBoard, FreeBoard
	
	// �����ϱ�(�۹�ȣ�� �ش��ϴ� ����, ������ �����Ѵ�.
	// @return : true �� �����Ϸ� false�� ����
	// @param : QABoard or UploadBoard or FreeBoard ����
	boolean update(Board board);
	
	// �۹�ȣ�� �ش��ϴ� �Խù� ��ȸ�ϱ�
	// @param : �۹�ȣ
	// @return : ��ȸ��  QABoard or UploadBoard or FreeBoard ����
	//			 ��ȸ�� ����� ������ null ����
	
	Board selectByBno(int bno);
	
	default void replyInsert() {
		System.out.println("BoardService replyInsert()�Դϴ�...");
	}
	
	static void selectAll() {
		System.out.println("BoardService selectAll()�Դϴ�...");
	}
	
	
	
}
