package com.java.validation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotEmpty.List;

@Constraint(validatedBy = {cityInputValidator.class })
@Target({ElementType.METHOD,ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
//@Repeatable(List.class)
public @interface cityvalid {
	String message() default "incorrect pattern";
	
	Class<?>[] groups() default { };
	Class<? extends Payload>[] payload() default{};

}
