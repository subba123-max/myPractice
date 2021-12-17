package com.java.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Agevalid, Integer> {

	public AgeValidator() {
		// TODO Auto-generated constructor stub
	}

	

	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		System.out.println(value);
		
//		boolean res=value.matches("([1-9]|1[0-9]|20)");
		boolean res=value.equals("([1-9]|1[0-9]|20)");
		System.out.println(res);
			return res;
			
	}

}
