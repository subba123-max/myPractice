package com.java.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@Controller
@EnableWebMvc
@EnableTransactionManagement 
@ComponentScan(basePackages = "com.java.*")
public class MVCConfiguration implements WebMvcConfigurer {

	@Bean
    public InternalResourceViewResolver viewResolver(){
	  System.out.println("i am in viewResolver...");
      InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
      internalResourceViewResolver.setPrefix("/WEB-INF/");
      internalResourceViewResolver.setSuffix(".jsp");
      System.out.println("internalResourceViewResolver:"+internalResourceViewResolver);
      return internalResourceViewResolver;
    }
//	DataSource datainfo() {
//		DriverManagerDataSource  datainfo = new DriverManagerDataSource();
//		datainfo.setUsername("root");
//		datainfo.setPassword("ramcharan123");
//		datainfo.setUrl("jdbc:mysql://localhost:3306/springdb");
//		datainfo.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		return datainfo;
//	}
//	
//	@Bean
//	public JdbcTemplate jdbcTemplate() {
//		JdbcTemplate jdbcTemplate= new JdbcTemplate(datainfo());
//		return jdbcTemplate;
//	}
	
	@Bean 
	public DriverManagerDataSource getDS() { 
	DriverManagerDataSource ds=new DriverManagerDataSource(); 
	 
	ds.setDriverClassName("com.mysql.jdbc.Driver"); 
	ds.setUrl("jdbc:mysql://localhost:3306/springdb"); 
	ds.setUsername("root"); 
	ds.setPassword("ramcharan123"); 
	 
	return ds; 
	} 
	
	@Bean 
	 public LocalSessionFactoryBean sessionFactory(DataSource dataSource) { 
	 LocalSessionFactoryBean factory = new LocalSessionFactoryBean();  
	 
	 Properties props = new Properties(); 
	 props.put("hibernate.show_sql", "true");
	 props.put("hibernate.transaction.factory_class", 
			 "org.hibernate.transaction.JDBCTransactionFactory");
	 props.put("hibernate.hbm2ddl.auto", "update"); 
	 
	 factory.setDataSource(dataSource); //1 
	 factory.setPackagesToScan("com.java.model"); //2 
	 factory.setHibernateProperties(props); //3 
	 return factory; 
	 }

	@Bean 
	public HibernateTemplate hibernateTemplate(SessionFactory sessionFactory) { 
	return new HibernateTemplate(sessionFactory); 
	}
	
	@Bean 
	public PlatformTransactionManager txManager(SessionFactory sessionFactory) { 
	return new HibernateTransactionManager(sessionFactory); 
	} 
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");

		WebMvcConfigurer.super.addResourceHandlers(registry);
	}
}
