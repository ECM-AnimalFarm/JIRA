package com.animalfarm.jira.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.animalfarm.jira.jira.JiraUserBOImpl;

/**
 * 로그인 Controller
 */
@Controller
public class LoginController {
	
	JiraUserBOImpl jiraUserBO = new JiraUserBOImpl();
	
	@RequestMapping(value = "/")
	public String toLogin() {
		return "login/login";
	}
	
	@RequestMapping(value = "/test/{memId}")
	public String checkLogin(@PathVariable("memId") int memId) {

		jiraUserBO.getUser(memId);

		return "login/login";
	}
}
