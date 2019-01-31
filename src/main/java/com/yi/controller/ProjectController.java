package com.yi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}
