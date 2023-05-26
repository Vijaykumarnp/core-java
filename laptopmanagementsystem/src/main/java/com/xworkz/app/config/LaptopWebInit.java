package com.xworkz.app.config;




import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.app.controller.LaptopController;

public class LaptopWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
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
