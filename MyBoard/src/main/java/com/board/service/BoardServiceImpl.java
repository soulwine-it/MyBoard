package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.board.domain.BoardVO;
import com.board.domain.Criteria;
import com.board.domain.SearchCriteria;
import com.board.persistence.BoardDAO;

@Repository
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	
	@Override
	public void write(BoardVO vo) throws Exception {
		dao.write(vo);

	}

	@Override
	public BoardVO read(int bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.read(bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		dao.update(vo);

	}

	@Override
	public void delete(int bno) throws Exception {
		dao.delete(bno);

	}

	@Override
	public List<BoardVO> list() throws Exception {
		
		return dao.list();
	}

	// 목록 + 페이지
	@Override
	public List<BoardVO> listPage(Criteria cri) throws Exception {
		
		return dao.listPage(cri);
	}

	@Override
	public int listCount() throws Exception {
		
		return dao.listCount();
	}

	@Override
	public List<BoardVO> listSearch(SearchCriteria scri) throws Exception {
		
		return dao.listSearch(scri);
				
	}

	@Override
	public int countSearch(SearchCriteria scri) throws Exception {
		
		return dao.countSearch(scri);
	}

}
