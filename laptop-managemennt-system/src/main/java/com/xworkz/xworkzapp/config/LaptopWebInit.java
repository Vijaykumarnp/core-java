package com.xworkz.xworkzapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.xworkzapp.controller.LaptopController;

public class LaptopWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
	System.out.println("Initializing Root Config Classes");
		return null;

	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {SpringConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

	
	
	
	
}
