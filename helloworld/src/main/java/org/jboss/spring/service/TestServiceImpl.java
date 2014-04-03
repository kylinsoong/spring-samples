package org.jboss.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service("TestServiceImpl")
public class TestServiceImpl implements TestService{

//	@Autowired
//	ApplicationContext context; 
	
	public TestServiceImpl() {
		
	}

	public void test() {
		
	}
}
