package test.board;

// QA�� ���õ� ����Ͻ����� ���...

public class QABoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("QABoardServiceImpl�� insert call..");
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("QABoardServiceImpl�� update call..");
		return true;
	}

	@Override
	public Board selectByBno(int bno) {
		System.out.println("QABoardServiceImpl�� selectByBno call..");
		return null;
	}

}
