package com.java.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.orm.hibernate5.HibernateTemplate; 


@Controller
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.java.*")
public class StudentConfig {

	@Bean
    public InternalResourceViewResolver viewResolver(){
	  System.out.println("i am in viewResolver...");
      InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
      internalResourceViewResolver.setPrefix("/WEB-INF/");
      internalResourceViewResolver.setSuffix(".jsp");
      System.out.println("internalResourceViewResolver:"+internalResourceViewResolver);
      return internalResourceViewResolver;
    }
	
	DataSource datainfo() {
		DriverManagerDataSource  datainfo = new DriverManagerDataSource();
		datainfo.setUsername("root");
		datainfo.setPassword("ramcharan123");
		datainfo.setUrl("jdbc:mysql://localhost:3306/db");
		datainfo.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return datainfo;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate= new JdbcTemplate(datainfo());
		return jdbcTemplate;
	}
	 
	
 
}
