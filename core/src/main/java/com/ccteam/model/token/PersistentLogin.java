package com.ccteam.model.token;

import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;

import java.util.Date;

/**
 * Created by cuongnv on 6/13/17.
 */
public class PersistentLogin {

    private String username;
    private String series;
    private String tokenValue;
    private Date date;

    public PersistentLogin(String username, String series, String tokenValue,
                           Date date) {
        this.username = username;
        this.series = series;
        this.tokenValue = tokenValue;
        this.date = date;
    }

    public PersistentLogin(PersistentRememberMeToken rememberMeToken) {
        this.username = rememberMeToken.getUsername();
        this.series = rememberMeToken.getSeries();
        this.tokenValue = rememberMeToken.getTokenValue();
        this.date = rememberMeToken.getDate();
    }

    public PersistentLogin() {
    }

    public String getUsername() {
        return username;
    }

    public String getSeries() {
        return series;
    }

    public String getTokenValue() {
        return tokenValue;
    }

    public Date getDate() {
        return date;
    }
}
