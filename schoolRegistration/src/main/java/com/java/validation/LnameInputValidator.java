package com.java.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LnameInputValidator implements ConstraintValidator<Lnamevalid, String> {

	public LnameInputValidator() {
		// TODO Auto-generated constructor stub
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		System.out.println("lname:"+value);
		boolean flag = false;
char[] charArray=value.toCharArray();
for(int i=0; i < charArray.length; i++){
	if( !Character.isUpperCase( charArray[i] )) {
		
        flag= false;
        
	}
	
	else {
		
		flag=true;
}

}
	
		System.out.println("lname status"+flag);
		
		
		
		return flag;
	}

}
