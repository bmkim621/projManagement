package com.yi.persistence;

import java.util.List;

import com.yi.domain.ProjectVO;

public interface ProjectDAO {
	//프로젝트 등록하기
	public void insert(ProjectVO vo);
	
	//마지막 번호 가져오기
	public int selectLastNo();
	
	//리스트 보기
	public List<ProjectVO> listAll();
	
	//상세보기
	public ProjectVO selectByNo(int no);
	
	//프로젝트 수정하기
	public void modify(ProjectVO vo);
	
	//프로젝트 삭제하기
	public void delete(int no);
}
