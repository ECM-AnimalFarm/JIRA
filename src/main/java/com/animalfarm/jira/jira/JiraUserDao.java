package com.animalfarm.jira.jira;

import org.springframework.stereotype.Service;

@Service("jiraUserDao")
public interface JiraUserDao {

	/**
	 * 하나의 유저 정보를 가지고 온다
	 * @param memId
	 * @return
	 */
	public JiraUser getJiraUser(int memId);
	
	/**
	 * JiraUser정보를 디비에 저장한다
	 * @param jiraUser
	 */
	public void setJiraUser(JiraUser jiraUser);
}
