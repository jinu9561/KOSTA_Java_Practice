package test.board;

// �����Խ��ǿ� ���õ� Business Logic ���

public class FreeBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println(super.getClass().getSimpleName() + "�� insert ����Դϴ�...");
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println(super.getClass().getSimpleName() + "�� update ����Դϴ�...");
		return true;
	}

	@Override
	public Board selectByBno(int bno) {
		System.out.println(super.getClass().getSimpleName() + "�� selectByBno ����Դϴ�...");
		return null;
	}
	
}
