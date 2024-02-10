package test.board;

// 자료실에 관련된 비즈니스 로직 담당...

public class UploadBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("UploadBoardServiceImpl의 insert call");
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("UploadBoardServiceImpl의 update call");
		return true;
	}

	@Override
	public Board selectByBno(int bno) {
		System.out.println("UploadBoardServiceImpl의 selectByBno call");
		return null;
	}

}
