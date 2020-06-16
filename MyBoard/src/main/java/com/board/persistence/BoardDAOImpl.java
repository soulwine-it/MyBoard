package com.board.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.BoardVO;
import com.board.domain.Criteria;

@Repository
public class BoardDAOImpl implements BoardDAO {

	
	//마이바티스
	@Inject
	private SqlSession sql;
	
	//매퍼
	private static String namespace="com.board.mappers.boardMapper";
	
	@Override
	public void write(BoardVO vo) throws Exception {
		sql.insert(namespace + ".write", vo);

	}

	@Override
	public BoardVO read(int bno) throws Exception {
		
		return sql.selectOne(namespace + ".read", bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		sql.update(namespace + ".update", vo);

	}

	@Override
	public void delete(int bno) throws Exception {
		sql.delete(namespace + ".delete", bno);

	}
	//리스트
	//selectList : 쿼리의 결과를 list로 반환한다. 결과가 없을 시 빈 list를 반환한다.
	@Override
	public List<BoardVO> list() throws Exception {
		// TODO Auto-generated method stub
		return sql.selectList(namespace + ".list");
	}
	
	// 목록 + 페이징
	@Override
	public List<BoardVO> listPage(Criteria cri) throws Exception {
		
		return sql.selectList(namespace + ".listPage", cri);
	}

	// 게시물 총 개수
	//selectOne 쿼리 결과가 없으면 null값을 반환한다.
	//쿼리 결과로 레코드가 하나만 나와야 한다. 
	@Override
	public int listCount() throws Exception {
		
		return sql.selectOne(namespace + ".listCount");
	}
	

}
