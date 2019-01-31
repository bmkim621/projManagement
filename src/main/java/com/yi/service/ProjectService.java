package com.yi.service;

import java.util.List;
import java.util.Map;

import com.yi.domain.ProjectContentVO;
import com.yi.domain.ProjectVO;

public interface ProjectService {
	//추가하기
	public void insertProject(ProjectVO projectVO, ProjectContentVO contentVO);
	
	//수정하기
	public void modifyProject(ProjectVO projectVO, ProjectContentVO contentVO);
	
	//삭제하기
	public int deleteProject(int no);
	
	//상세보기
	public Map<String, Object> readProject(int no);
	
	//프로젝트 리스트 보기
	public List<ProjectVO> projectList();
}
