package com.ccteam.config;

import com.ccteam.datasource.token.TokenAdminLoginDataSource;
import com.ccteam.model.admin.field.AdminRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    @Qualifier("adminLoginService")
    UserDetailsService userDetailsService;

    @Autowired
    TokenAdminLoginDataSource tokenAdminLoginDataSource;

    @Override
    public void configure(WebSecurity webSecurity) throws Exception {
        webSecurity.ignoring().antMatchers(
                "/assets/**",
                "/webjars/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //.antMatchers("/**").permitAll()
                .antMatchers("/auth/**", "/error").permitAll()
                .antMatchers("/image/**").permitAll()
                .antMatchers("/finger/**").permitAll()
                //.antMatchers("/gym/**").hasAuthority(AdminRole.Administrator.name())
                //.antMatchers("/gym/**").hasAnyAuthority(AdminRole.Staff.name(),AdminRole.Administrator.name())
                //.antMatchers("/gym/**").hasAnyAuthority(AdminRole.Administrator.name(),AdminRole.Staff.name(), AdminRole.Customer.name())
                .anyRequest().authenticated()
                .and().exceptionHandling().accessDeniedPage("/403");

        http.formLogin()
                .loginProcessingUrl("/finger/login")
                .loginPage("/finger/auth")
                .usernameParameter("username").passwordParameter("password")
                .and()
            .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout**"))
                .deleteCookies("JSESSIONID")
                .invalidateHttpSession(true)
                .logoutSuccessUrl("/finger/auth")
                .permitAll()
                .and()
            .sessionManagement().invalidSessionUrl("/");

        //remember me configuration
        http.rememberMe()
                .tokenRepository(persistentTokenRepository())
                .rememberMeParameter("remember-me")
                .rememberMeCookieName("finger-remember-me")
                .tokenValiditySeconds(86400 * 30);
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        return tokenAdminLoginDataSource;
    }
}
