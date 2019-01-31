package com.yi.projManagement;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yi.domain.ProjectVO;
import com.yi.persistence.ProjectDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ProjectDAOTest {

	@Autowired
	private ProjectDAO dao;
	
	//프로젝트 등록
	@Test
	public void testInsertProject() {
		ProjectVO vo = new ProjectVO();
		vo.setProject_name("프로젝트 관리 시스템22");
		vo.setProgress("진행중2");
		vo.setStart_date(new Date());
		vo.setEnd_date(new Date());

		dao.insert(vo);
		int res = dao.selectLastNo();
		System.out.println(res);
	}
	
	//리스트
	//@Test
	public void testListAll() {
		List<ProjectVO> list = dao.listAll();
		System.out.println(list);
	}
	
	//읽기
	//@Test
	public void testSelectByNo() {
		ProjectVO vo = dao.selectByNo(2);
		System.out.println(vo);
	}
	
	//수정
	//@Test
	public void testModify() {
		ProjectVO vo = new ProjectVO();
		vo.setProject_name("프로젝트 수정하기");
		vo.setStart_date(new Date());
		vo.setEnd_date(new Date());
		vo.setProgress("보류");
		vo.setProject_no(2);
		
		dao.modify(vo);
	}
	
	//삭제
	//@Test
	public void testDelete() {
		dao.delete(3);
	}
}
