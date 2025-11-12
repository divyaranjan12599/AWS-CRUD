package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testAdd() {
        App app = new App();
        int result = app.add(2, 3);
        assertEquals(5, result);
    }
}
