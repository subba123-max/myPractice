package com.java.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class cityInputValidator implements ConstraintValidator<cityvalid, String> {

	public cityInputValidator() {
		// TODO Auto-generated constructor stub
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		System.out.println("city val:"+value);
		boolean res=value.endsWith("pur");
		System.out.println("city status:"+res);

		return res;
	}

}
