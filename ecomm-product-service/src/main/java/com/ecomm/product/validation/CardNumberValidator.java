package com.ecomm.product.validation;

import javax.validation.ConstraintValidator;  
import javax.validation.ConstraintValidatorContext;  
  
public class CardNumberValidator implements ConstraintValidator<CardValidation,String> {  
  
    public boolean isValid(String cardNumber, ConstraintValidatorContext cvc) {  
        return cardNumber.length()<16 ? false : true;  
    }  
}  
