package com.security.learn.security_project;

import com.security.learn.security_project.entities.User;
import com.security.learn.security_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.UUID;

@SpringBootApplication
public class SecurityProjectApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SecurityProjectApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {

        User user = userRepository.findByUserName("substring").orElse(null);

        if (user == null) {
            user = new User();

            user.setUserId(UUID.randomUUID().toString());
            user.setUserName("substring");
            user.setPassword(passwordEncoder.encode("substring123"));
            user.setRole("USER");
            userRepository.save(user);
            System.out.println("User created ;;;"+user);
        }
        System.out.println(user.getUserId());

    }
}