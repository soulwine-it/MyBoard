package com.board.persistence;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardDAO {
	
	public void write(BoardVO vo) throws Exception;
	
	public BoardVO read(int bno) throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
	public void delete(int bno) throws Exception;
	
	public List<BoardVO> list() throws Exception;
}
