package app.mvc.service;

import java.util.List;

import app.mvc.dao.BoardDAO;
import app.mvc.dao.BoardDAOImpl;
import app.mvc.dto.BoardDTO;
import app.mvc.dto.ReplyDTO;
import app.mvc.exception.DMLException;
import app.mvc.exception.SearchWrongException;
/**
 * @author 
 * */
public class BoardServiceImpl implements BoardService {
	private static BoardService instance = new BoardServiceImpl();
	private BoardDAO boardDao = BoardDAOImpl.getInstance();
			
	private BoardServiceImpl() {}
    public static BoardService getInstance() {
		return instance;
	}
	@Override
	public List<BoardDTO> boardSelectAll() throws SearchWrongException {
		
		
		return null;
	}

	@Override
	public List<BoardDTO> boardSelectBySubject(String keyWord) throws SearchWrongException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO boardSelectByNo(int boardNo) throws SearchWrongException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void boardInsert(BoardDTO boardDTO) throws DMLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void boardUpdate(BoardDTO boardDTO) throws DMLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void boardDelete(int boardNo) throws DMLException {
		

	}

	@Override
	public void replyInsert(ReplyDTO replyDTO) throws DMLException {
		// TODO Auto-generated method stub

	}

	@Override
	public BoardDTO replySelectByParentNo(int boardNo) throws SearchWrongException {
		
		return null;
	}

}











