package com.ccteam.common.password;

import com.ccteam.common.validator.PasswordConfirmed;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.validation.constraints.Size;
import java.io.Serializable;

@PasswordConfirmed(fieldPassword = "value", fieldConfirm = "confirmValue")
public class Password implements Serializable {
    @NotBlank(message = "{user.update.form.error.notNull}")
    @Size(min = 6, message = "{user.update.form.error.password.lenght}")
    String value;
    @NotBlank(message = "{user.update.form.error.notNull}")
    @Size(min = 6, message = "{user.update.form.error.password.lenght}")
    String confirmValue;

    public Password() {
    }

    public Password(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getConfirmValue() {
        return confirmValue;
    }

    public String getHashedValue() {
        return new BCryptPasswordEncoder().encode(value);
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setConfirmValue(String confirmValue) {
        this.confirmValue = confirmValue;
    }
}
