package com.test;

import com.test.Dao.TempFactoryBean;
import com.test.Dao.User;
import com.test.Dao.UserDao;
import com.test.Dao.UserInvocationHandler;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) throws Exception{
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		User user1 = ac.getBean(User.class);
		User user2 = ac.getBean(User.class);
		user1.query();
		System.out.println(user1.hashCode()+"-------------"+user2.hashCode());
		String className=User.class.getName();
		Class clazz=Class.forName(className);
		Method m=clazz.getMethod("query");
		List list = new ArrayList<List>(){{
			add(new ArrayList<Integer>());
			add(new ArrayList<Integer>());
		}};


/*		SqlSessionFactoryBean*/
/*		UserDao JdkProxy = (UserDao) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{UserDao.class}, new UserInvocationHandler(new User()));
		JdkProxy.query();*/
	}
}
