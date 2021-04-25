package com.ecomm.payment.validation;

import java.lang.annotation.ElementType;  
import java.lang.annotation.Retention;  
import java.lang.annotation.RetentionPolicy;  
import java.lang.annotation.Target;  
  
import javax.validation.Constraint;  
import javax.validation.Payload;  
  
@Constraint(validatedBy = CardNumberValidator.class)  
@Target( { ElementType.METHOD, ElementType.FIELD } )  
@Retention(RetentionPolicy.RUNTIME)  
public @interface CardValidation {  
        public String message() default "must contain jtp";  
        public Class<?>[] groups() default {};  
        public Class<? extends Payload>[] payload() default {};  
} 