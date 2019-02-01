package com.yi.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yi.domain.ProjectContentVO;
import com.yi.domain.ProjectVO;
import com.yi.service.ProjectService;

@Controller
@RequestMapping("/project/*")
public class ProjectController {
	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);
	
	@Autowired
	private ProjectService service;
	
	//프로젝트 등록하기 GET : 입력 폼 화면
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public void registerGet() {
		logger.info("=======> register : GET");
	}
	
	//프로젝트 등록하기 POST : 프로젝트 등록하기
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String registerPost(ProjectVO projectVO, ProjectContentVO contentVO, Model model) {
		logger.info("=======> register : POST");
		service.insertProject(projectVO, contentVO);
		
		//F5누르면 계속 같은 데이터 추가되기 때문에 redirect 시켜준다.
		return "redirect:/project/list";
		
	}
	
	//프로젝트 리스트보기
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void listAll(Model model) {
		logger.info("=======> list : GET");
		List<ProjectVO> list = service.projectList();
		
		model.addAttribute("list", list);
	}
	
	//프로젝트 상세보기
	@RequestMapping(value = "read", method = RequestMethod.GET)
	public void read(@RequestParam("project_no") int project_no, Model model) {
		logger.info("=======> read : GET");
		
		Map<String, Object> map = service.readProject(project_no);
		model.addAttribute("map", map);
	}
	
	//수정하기
	@RequestMapping(value = "modify", method = RequestMethod.GET)
	public void modify(@RequestParam("project_no") int project_no, Model model) {
		logger.info("=======> modify : GET");
		
		Map<String, Object> map = service.readProject(project_no);
		logger.info("====> map : " + map);
		
		model.addAttribute("map", map);
	
	}
	
	@RequestMapping(value = "modify", method = RequestMethod.POST)
	public String modify(@RequestParam("project_no") int project_no, Model model, ProjectVO projectVO, ProjectContentVO contentVO) {
		logger.info("=======> modify : POST");
		logger.info("=======> project_no = " + project_no);
		
		service.modifyProject(projectVO, contentVO);
		
		return "redirect:/project/read?project_no=" + projectVO.getProject_no();
	}
}
