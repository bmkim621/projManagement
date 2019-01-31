package com.yi.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yi.domain.ProjectVO;

@Repository
public class ProjectDaoImpl implements ProjectDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private static final String namespace = "com.yi.mapper.ProjectMapper";

	@Override
	public void insert(ProjectVO vo) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace + ".insert", vo);
	}

	@Override
	public int selectLastNo() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".selectLastNo");
	}

	@Override
	public List<ProjectVO> listAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace + ".listAll");
	}

	@Override
	public ProjectVO selectByNo(int no) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".selectByNo", no);
	}

	@Override
	public void modify(ProjectVO vo) {
		// TODO Auto-generated method stub
		sqlSession.update(namespace + ".modify", vo);
	}

	@Override
	public void delete(int no) {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace + ".delete", no);
	}

}
