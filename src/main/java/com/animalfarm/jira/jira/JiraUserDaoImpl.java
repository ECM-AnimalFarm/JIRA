package com.animalfarm.jira.jira;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

public class JiraUserDaoImpl implements JiraUserDao {

	@Resource
	private SessionFactory sessionFactory;
	
	@Override
	public JiraUser getJiraUser(int memId) {
		Session session = sessionFactory.openSession();
		JiraUser list = (JiraUser) session.createCriteria(JiraUser.class).list();
		return list;
	}

	@Override
	public void setJiraUser(JiraUser jiraUser) {
		
	}

}
