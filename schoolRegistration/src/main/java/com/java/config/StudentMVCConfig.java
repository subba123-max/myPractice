package com.java.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentMVCConfig  extends AbstractAnnotationConfigDispatcherServletInitializer {

		@Override
		protected Class<?>[] getRootConfigClasses() {
			// TODO Auto-generated method stub
			return new Class[] {StudentConfig.class};
		}

		@Override
		protected Class<?>[] getServletConfigClasses() {
			// TODO Auto-generated method stub
			Class[] configFiles = {StudentConfig.class};
			return configFiles;
		}

		@Override
		protected String[] getServletMappings() {
			// TODO Auto-generated method stub
			String[] mappings= {"/"};
			return mappings;
		}

	
}
