package com.enigma.config;

import com.enigma.services.implement.CustomServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.HeaderWriterLogoutHandler;
import org.springframework.security.web.header.HeaderWriterFilter;
import org.springframework.security.web.header.writers.ClearSiteDataHeaderWriter;

@Configuration
@EnableWebSecurity
public class CustomWebSecurityConfigurer extends WebSecurityConfigurerAdapter {
    @Autowired
    CustomServices customServices;
    /**
     * Configure global.
     *
     * @param auth the auth
     * @throws Exception the exception
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customServices);
//        auth.inMemoryAuthentication()
//                .withUser("admin")
//                .password(passwordEncoder().encode( "password"))
//                .roles("admin");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //http.csrf().disable().authorizeRequests().antMatchers("/login").permitAll().anyRequest().authenticated().and().httpBasic();
        //http.formLogin().loginPage("/login");JSESSIONID
        //http.logout().logoutUrl("/logout").invalidateHttpSession(true).deleteCookies("JSESSIONID");
        //http.logout().logoutUrl("/logout").invalidateHttpSession(true).deleteCookies("JSESSIONID").addLogoutHandler(new HeaderWriterLogoutHandler(new ClearSiteDataHeaderWriter(ClearSiteDataHeaderWriter.Directive.COOKIES,ClearSiteDataHeaderWriter.Directive.CACHE )));
        http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic();
        http.formLogin();
        http.logout().logoutUrl("/logout").invalidateHttpSession(true).deleteCookies("JSESSIONID");
    }

    /**
     * Password encoder password encoder.
     *
     * @return the password encoder
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
