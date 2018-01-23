package com.curso.spring.mvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		
		webApplicationContext.setConfigLocation("com.curso.spring.mvc.config");
		
		servletContext.addServlet("dispatcherServlet", new DispatcherServlet(webApplicationContext));
		
	}

}
