package test.board;

// �ڷ�ǿ� ���õ� ����Ͻ� ���� ���...

public class UploadBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("UploadBoardServiceImpl�� insert call");
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("UploadBoardServiceImpl�� update call");
		return true;
	}

	@Override
	public Board selectByBno(int bno) {
		System.out.println("UploadBoardServiceImpl�� selectByBno call");
		return null;
	}

}
