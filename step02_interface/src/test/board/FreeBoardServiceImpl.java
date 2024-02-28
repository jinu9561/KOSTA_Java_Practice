package test.board;

// 자유게시판에 관련된 Business Logic 담당

public class FreeBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println(super.getClass().getSimpleName() + "의 insert 기능입니다...");
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println(super.getClass().getSimpleName() + "의 update 기능입니다...");
		return true;
	}

	@Override
	public Board selectByBno(int bno) {
		System.out.println(super.getClass().getSimpleName() + "의 selectByBno 기능입니다...");
		return null;
	}
	
}
