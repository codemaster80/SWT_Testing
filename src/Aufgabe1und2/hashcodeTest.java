package Aufgabe1und2;

import org.junit.jupiter.api.*;

class hashcodeTest {
    hashcode h;

    @BeforeEach
    void setUp() throws Exception {
        h = new hashcode();
    }

    @Test
    @Order(1)
    void testHashCode() {
        Assertions.assertEquals(16, h.hashCode("Paul",32));
    }

    @Test
    @Order(2)
    // @DisplayName("myHashCode")
    void testMyHashCode() {
        Assertions.assertEquals(218, h.myHashCode("Paul",32));
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> { h.myHashCode("Paul",0); });
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> { h.myHashCode("",12); });
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> { h.myHashCode("",0); });
    }
}