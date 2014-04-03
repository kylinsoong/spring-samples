package org.jboss.spring.servlet;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@WebServlet("/TestServiceServlet")
public class TestServiceServlet extends HttpServlet {

	private static final long serialVersionUID = 5073242581372884958L;
	
//	@Autowired
//	private ApplicationContext context;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		doPost(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
		System.out.println(emf);
		System.out.println(context.getBean("transactionManager"));
	}

}
