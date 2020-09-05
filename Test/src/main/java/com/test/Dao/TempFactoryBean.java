package com.test.Dao;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("tempFactoryBean")
@Primary
public class TempFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
