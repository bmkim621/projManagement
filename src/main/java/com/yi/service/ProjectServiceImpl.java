package com.yi.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yi.domain.ProjectContentVO;
import com.yi.domain.ProjectVO;
import com.yi.persistence.ProjectContentDAO;
import com.yi.persistence.ProjectDAO;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectDAO projectDao;
	
	@Autowired
	private ProjectContentDAO contentDao;

	@Override
	public void insertProject(ProjectVO projectVO, ProjectContentVO contentVO) {
		// TODO Auto-generated method stub
		projectDao.insert(projectVO);
		contentVO.setProject_no(projectVO.getProject_no());
		contentDao.insert(contentVO);
	}

	@Override
	public void modifyProject(ProjectVO projectVO, ProjectContentVO contentVO) {
		// TODO Auto-generated method stub
		projectDao.modify(projectVO);
		contentDao.modify(contentVO);
	}

	@Override
	public int deleteProject(int no) {
		// TODO Auto-generated method stub
		ProjectVO delVO = projectDao.selectByNo(no);
		if(delVO.getProject_no() == no) {
			projectDao.delete(no);
		} else {
			return -1;
		}
		
		ProjectContentVO contentDelVO = contentDao.selectByNo(no);
		if(contentDelVO.getProject_no() == no) {
			contentDao.delete(no);
		} else {
			return -2;
		}
		
		return 0;
	}

	@Override
	public Map<String, Object> readProject(int no) {
		// TODO Auto-generated method stub
		ProjectVO project = projectDao.selectByNo(no);
		ProjectContentVO content = contentDao.selectByNo(no);
		
		Map<String, Object> map = new HashMap<>();
		map.put("project", project);
		map.put("content", content);
		
		return map;
	}

	@Override
	public List<ProjectVO> projectList() {
		// TODO Auto-generated method stub
		return projectDao.listAll();
	}



}
