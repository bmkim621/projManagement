package com.yi.projManagement;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yi.domain.ProjectContentVO;
import com.yi.domain.ProjectVO;
import com.yi.service.ProjectService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ProjectServiceTest {
	
	@Autowired
	private ProjectService service;
	
	//등록
	//@Test
	public void testRegister() {
		ProjectVO project = new ProjectVO();
		project.setProject_name("프로젝트 등록하기");
		project.setStart_date(new Date());
		project.setEnd_date(new Date());
		project.setProgress("보류");
		
		ProjectContentVO content = new ProjectContentVO();
		content.setContent("프로젝트 등록하기 내용 들어갈 부분!!");
		service.insertProject(project, content);
	}
	
	//@Test
	public void testListAll() {
		List<ProjectVO> list = service.projectList();
		System.out.println(list);
	}
	
	//읽기
	//@Test
	public void testReadProject() {
		Map<String, Object> map = service.readProject(3);
		System.out.println("map ==============> " + map);
	}
	
	//수정하기
	//@Test
	public void testModify() {
		ProjectVO project = new ProjectVO();
		project.setProject_name("프로젝트 수정하기");
		project.setStart_date(new Date());
		project.setEnd_date(new Date());
		project.setProgress("보류");
		project.setProject_no(2);
		
		ProjectContentVO content = new ProjectContentVO();
		content.setContent("수정하기 테스트!!!!!");
		content.setProject_no(2);
		
		service.modifyProject(project, content);
	}
	
	//삭제하기
	//@Test
	public void testDelete() {
		service.deleteProject(1);
	}
}
