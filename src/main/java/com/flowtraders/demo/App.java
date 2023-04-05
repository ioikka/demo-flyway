package com.flowtraders.demo;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
public class App {
    public static void main(String[] args) {
        log.info("App starting at {}", LocalDateTime.now());
        log.info("Exiting main() at {}", LocalDateTime.now());
    }
}
