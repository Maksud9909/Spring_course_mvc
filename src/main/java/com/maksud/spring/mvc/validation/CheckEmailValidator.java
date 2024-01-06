package com.maksud.spring.mvc.validation;




import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator
        implements ConstraintValidator<CheckEmail,String> { // здесь должен быть сам класс и тип данных, который она использует
    private String endOfEmail;
    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfEmail = checkEmail.value();
    }

    @Override
    public boolean isValid(String eneteredValue,ConstraintValidatorContext context) {
        return eneteredValue.endsWith(endOfEmail);
    }
}
