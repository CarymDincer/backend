package com.behindthegoal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "persistence")  // ✅ Repository'leri tara
@ComponentScan(basePackages = {"com.behindthegoal", "persistence", "domain", "api", "integrationTest"}) // ✅ Tüm bileşenleri tara
@EntityScan(basePackages = "persistence")  // ✅ Persistence paketindeki entity'leri tara
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
