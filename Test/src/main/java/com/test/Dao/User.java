package com.test.Dao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class User implements UserDao, ApplicationContextAware {
	@Autowired
	@Qualifier("tempFactoryBean")
	private TempFactoryBean tempFactoryBean;
	private ApplicationContext applicationContext;

	@Override
	public void query(){
		System.out.println("log");
		System.out.println(applicationContext);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
	}
}
