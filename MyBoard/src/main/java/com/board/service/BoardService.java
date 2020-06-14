package com.board.service;

import com.board.domain.BoardVO;

public interface BoardService {
	//작성
	public void write(BoardVO vo) throws Exception;
	
	public BoardVO read(int bno) throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
	public void delete(int bno) throws Exception;
}	
