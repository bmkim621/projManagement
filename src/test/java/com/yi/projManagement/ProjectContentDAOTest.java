package com.yi.projManagement;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yi.domain.ProjectContentVO;
import com.yi.persistence.ProjectContentDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ProjectContentDAOTest {
	
	@Autowired
	private ProjectContentDAO dao;
	
	//등록
	//@Test
	public void testInsert() {
		ProjectContentVO vo = new ProjectContentVO();
		vo.setContent("프로젝트 관리 시스템 내용222");
		vo.setProject_no(2);
		
		dao.insert(vo);
	}
	
	//@Test
	public void testModify() {
		ProjectContentVO vo = new ProjectContentVO();
		vo.setContent("프로젝트 관리 시스템 내용 수정하기");
		vo.setProject_no(2);
		
		dao.modify(vo);
	}
	
	//@Test
	public void testSelectByNo() {
		ProjectContentVO vo = dao.selectByNo(2);
		System.out.println(vo);
	}
	
	//@Test
	public void testDelete() {
		dao.delete(2);
	}


}
