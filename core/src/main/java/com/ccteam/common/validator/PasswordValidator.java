package com.ccteam.common.validator;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<PasswordConfirmed, Object> {
    private String fieldPassword;
    private String fieldConfirmPassword;
    private String message;

    @Override
    public void initialize(PasswordConfirmed annotation) {
        this.fieldPassword = annotation.fieldPassword();
        this.fieldConfirmPassword = annotation.fieldConfirm();
        this.message = annotation.message();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        BeanWrapper beanWrapper = new BeanWrapperImpl(value);

        String password = (String)beanWrapper.getPropertyValue(fieldPassword);
        String confirmPassword = (String)beanWrapper.getPropertyValue(fieldConfirmPassword);

        if (password == null
                || confirmPassword == null
                || !password.equals(confirmPassword)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(message)
                    .addPropertyNode(fieldConfirmPassword)
                    .addConstraintViolation();
            return false;
        }
        return true;
    }
}
