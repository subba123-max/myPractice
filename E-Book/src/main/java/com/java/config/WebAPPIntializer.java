package com.java.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAPPIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override 
	 protected Class<?>[] getRootConfigClasses() { 
	 return new Class[] { MVCConfiguration.class }; 
	 } 
	 @Override 
	 protected Class<?>[] getServletConfigClasses() { 
	 return new Class[] { MVCConfiguration.class }; 
	 } 
	 @Override 
	 protected String[] getServletMappings() { 
		 String[] mappings={"/"};
	 return mappings; 
	 }

	

}
