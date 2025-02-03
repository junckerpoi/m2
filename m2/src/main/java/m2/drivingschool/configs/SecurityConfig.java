package m2.drivingschool.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/admin/**").hasRole("admin")
                        .anyRequest().authenticated())
                .formLogin(login -> login
                        .defaultSuccessUrl("/admin/dashboard", true)
                        .permitAll())
                .logout(logout -> logout.logoutUrl("/logout").permitAll());

        return http.build();
    }
}
