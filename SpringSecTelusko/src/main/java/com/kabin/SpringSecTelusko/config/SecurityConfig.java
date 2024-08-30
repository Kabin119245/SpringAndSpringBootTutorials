package com.kabin.SpringSecTelusko.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

   @Autowired
   private UserDetailsService userDetailsService;

   @Bean
   public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

      return http
            .csrf(customizer -> customizer.disable())
            .authorizeHttpRequests(request -> request.anyRequest().authenticated())
            // .formLogin(Customizer.withDefaults())
            .httpBasic(Customizer.withDefaults())
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .build();
   }

//   @Bean
//   public UserDetailsService userDetailsService() {
//
//
//      UserDetails user1 = User
//              .withDefaultPasswordEncoder()
//              .username("kanchan")
//              .password("2078")
//              .roles("USER")
//              .build();
//
//      UserDetails user2 = User
//              .withDefaultPasswordEncoder()
//              .username("asmita")
//              .password("2078")
//              .roles("USER")
//              .build();
//
//      return new InMemoryUserDetailsManager(user1,user2);
//   }
   // or we can create class that implements UserDetailsService


   @Bean
   public AuthenticationProvider authenticationProvider() {
      DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
     // provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
      //now using BCrypt passwordEncoder
      provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
      provider.setUserDetailsService(userDetailsService);

      return provider;

   }

   //bcrypt password encoder

}
