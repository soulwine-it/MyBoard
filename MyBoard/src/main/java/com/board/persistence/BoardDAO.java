package com.board.persistence;

import java.util.List;

import com.board.domain.BoardVO;
import com.board.domain.Criteria;

public interface BoardDAO {
	
	public void write(BoardVO vo) throws Exception;
	
	public BoardVO read(int bno) throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
	public void delete(int bno) throws Exception;
	
	public List<BoardVO> list() throws Exception;
	// 목록 + 페이징
	public List<BoardVO> listPage(Criteria cri) throws Exception;
	//게시물 총 갯수
	public int listCount() throws Exception;
}
