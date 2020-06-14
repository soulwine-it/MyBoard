package com.board.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.BoardVO;

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

}
