package com.test.Dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserInvocationHandler implements InvocationHandler {
	Object target;

	public UserInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("invoke");
		return method.invoke(target,args);
	}
}
