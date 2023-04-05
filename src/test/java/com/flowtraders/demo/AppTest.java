package com.flowtraders.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class AppTest {

    @Test
    void firstTest() {
        Assertions.assertDoesNotThrow(() -> log.info("Not throwing anything"));
    }
}
