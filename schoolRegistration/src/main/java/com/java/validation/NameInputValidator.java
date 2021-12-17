package com.java.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameInputValidator implements ConstraintValidator<namevalid, String> {

	public NameInputValidator() {
		// TODO Auto-generated constructor stub
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		System.out.println("val:"+value);
		boolean res=value.contains("ha");
		System.out.println("fname status:"+res);

		return res;
	}

}
