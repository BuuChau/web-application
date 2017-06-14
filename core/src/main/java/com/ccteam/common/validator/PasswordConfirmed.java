package com.ccteam.common.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy={PasswordValidator.class})
public @interface PasswordConfirmed {
    String message() default "{users.form.password.confirm.error.do.not.match}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String fieldPassword() default "password";
    String fieldConfirm() default "confirm";

    @Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public static @interface List
    {
        PasswordConfirmed[] value();
    }

}
