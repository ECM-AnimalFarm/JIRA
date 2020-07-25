package com.animalfarm.jira.jira;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class JiraUserDaoImpl implements JiraUserDao
{
	static SessionFactory factory;
	static Session session;
	
	/** * hibernate.cfg.xml의 설정을 읽어서 * db와 연결하는 설정 */
	static
	{
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
		factory = configuration.buildSessionFactory(builder.build());
		session = factory.openSession();
	}

	@Override
	public JiraUser getJiraUser(int memId)
	{
		Session session = factory.openSession();
		JiraUser list = (JiraUser) session.createCriteria(JiraUser.class).list();
		return list;
	}

	@Override
	public void setJiraUser(JiraUser jiraUser)
	{

	}

}
