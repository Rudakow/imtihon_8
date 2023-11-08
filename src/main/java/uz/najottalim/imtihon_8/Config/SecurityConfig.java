package uz.najottalim.imtihon_8.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("TEACHER").password(passwordEncoder().encode("098765432111111")).roles("TEACHER")
                .and()
                .withUser("ADMIN").password(passwordEncoder().encode("1234567890")).roles("ADMIN");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                csrf().
                disable().
                headers().
                frameOptions().
                disable()
                .and().
                authorizeRequests()
                .antMatchers("group/").hasAnyRole("ADMIN")
                .antMatchers("student/**").permitAll()
                .antMatchers("/group/get/{id}").hasAnyRole("TEACHER")
                .anyRequest().authenticated()
                .and().httpBasic();
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}