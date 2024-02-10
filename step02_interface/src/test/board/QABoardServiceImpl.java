package test.board;

// QA에 관련된 비즈니스로직 담당...

public class QABoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("QABoardServiceImpl의 insert call..");
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("QABoardServiceImpl의 update call..");
		return true;
	}

	@Override
	public Board selectByBno(int bno) {
		System.out.println("QABoardServiceImpl의 selectByBno call..");
		return null;
	}

}
