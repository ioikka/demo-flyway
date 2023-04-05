package com.flowtraders.demo;

import lombok.extern.slf4j.Slf4j;
import org.flywaydb.core.Flyway;

import java.time.LocalDateTime;

@Slf4j
public class App {

    public static void main(String[] args) {
        log.info("App starting at {}", LocalDateTime.now());
        migrateDatabase();
        log.info("Exiting main() at {}", LocalDateTime.now());
    }

    private static void migrateDatabase() {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:mariadb://localhost:3306/flyway_demo", "flyway_svc", "PASSWORD")
                .load();
        flyway.migrate();
    }
}
