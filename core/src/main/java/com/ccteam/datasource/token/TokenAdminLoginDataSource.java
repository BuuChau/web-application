package com.ccteam.datasource.token;

import com.ccteam.model.token.PersistentLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created by cuongnv on 6/13/17.
 */
@Repository
public class TokenAdminLoginDataSource implements PersistentTokenRepository {

    @Autowired
    TokenAdminLoginMapper tokenAdminLoginMapper;

    @Override
    public void createNewToken(PersistentRememberMeToken token) {
        tokenAdminLoginMapper.createNewToken(new PersistentLogin(token));
    }

    @Override
    public void updateToken(String series, String tokenValue, Date lastUsed) {
        tokenAdminLoginMapper.updateToken(series,tokenValue,lastUsed);
    }

    @Override
    public PersistentRememberMeToken getTokenForSeries(String seriesId) {
        PersistentLogin login = tokenAdminLoginMapper.getTokenForSeries(seriesId);
        if (login != null)
            return new PersistentRememberMeToken(login.getUsername(),login.getSeries(),login.getTokenValue(),login.getDate());
        return null;
    }

    @Override
    public void removeUserTokens(String username) {
        tokenAdminLoginMapper.removeUserTokens(username);
    }
}
