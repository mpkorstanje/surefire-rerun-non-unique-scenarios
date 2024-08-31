package io.cucumber.skeleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JupiterReproducerTest {

    @Test
    @DisplayName("test")
    void test1() {
        Assumptions.assumeTrue(false);
    }

    @Test
    @DisplayName("test")
    void test2() {
        Assertions.assertTrue(false);
    }

    @Test
    @DisplayName("test")
    void test3() {

    }

}
