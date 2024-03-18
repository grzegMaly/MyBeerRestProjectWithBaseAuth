package myproject.beerrestwithbaseauth.beerrestwithbaseauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        /**
         * Ustawienie autoryzacji na wszystko
         * Wyłączenie tokenu csrf dla /api
         */
        http.authorizeHttpRequests(auth -> {
                    auth.anyRequest().authenticated();
                }).httpBasic(Customizer.withDefaults())
                .csrf(csrf -> csrf.ignoringRequestMatchers("/api/**"));

        return http.build();
    }
}
