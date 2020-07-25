package com.animalfarm.jira.jira;

import org.springframework.stereotype.Service;

@Service("jiraUserBOImpl")
public class JiraUserBOImpl implements JiraUserBO{

	//@Autowired
	JiraUserDaoImpl jiraUserDao = new JiraUserDaoImpl();
	
	@Override
	public JiraUser getUser(int memId) {
		return jiraUserDao.getJiraUser(memId);
	}

	@Override
	public void insertUser(JiraUser jiraUser) {
		jiraUserDao.setJiraUser(jiraUser);;
	}
	
}
