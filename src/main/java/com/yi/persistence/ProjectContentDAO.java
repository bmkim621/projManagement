package com.yi.persistence;

import com.yi.domain.ProjectContentVO;

public interface ProjectContentDAO {
	//등록하기
	public void insert(ProjectContentVO vo);
	
	//수정하기
	public void modify(ProjectContentVO vo);
	
	//삭제하기
	public void delete(int no);
	
	//마지막 번호 가지고오기
	public ProjectContentVO selectByNo(int no);
}
