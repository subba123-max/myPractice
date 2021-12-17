package com.java.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = {LnameInputValidator.class })
@Target({ElementType.METHOD,ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Lnamevalid {
String message() default "all letter should be capitals";
	
	Class<?>[] groups() default { };
	Class<? extends Payload>[] payload() default{};

}
