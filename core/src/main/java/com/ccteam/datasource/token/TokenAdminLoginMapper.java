package com.ccteam.datasource.token;

import com.ccteam.model.token.PersistentLogin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
 * Created by cuongnv on 6/13/17.
 */
@Mapper
public interface TokenAdminLoginMapper {

    void createNewToken(@Param("persistentLogin") PersistentLogin persistentLogin);

    void updateToken(@Param("series") String series, @Param("tokenValue") String tokenValue, @Param("lastUsed") Date lastUsed);

    PersistentLogin getTokenForSeries(@Param("series") String seriesId);

    void removeUserTokens(@Param("username") String username);
}
