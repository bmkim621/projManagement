package com.yi.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yi.domain.ProjectContentVO;

@Repository
public class ProjectContentDaoImpl implements ProjectContentDAO {

	@Autowired
	private SqlSession sqlSession;
	private static final String namespace = "com.yi.mapper.ProjectContentMapper";
	
	@Override
	public void insert(ProjectContentVO vo) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace + ".insert", vo);
	}

	@Override
	public void modify(ProjectContentVO vo) {
		// TODO Auto-generated method stub
		sqlSession.update(namespace + ".modify", vo);
	}

	@Override
	public void delete(int no) {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace + ".delete", no);
	}

	@Override
	public ProjectContentVO selectByNo(int no) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".selectByNo", no);
	}

}
