package Aufgabe3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class wasserkostenTest {
        wasserkosten w;

        @BeforeEach
        void setUp() throws Exception {
            w = new wasserkosten();
        }

        @Test
        void testCalculate() {
            Assertions.assertEquals(219.79, w.calculate(12,1));
            Assertions.assertEquals(211215.57, w.calculate(12, 99999));
            org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> { w.calculate(-5, 80); });
            org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> { w.calculate(15, 80); });
            org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> { w.calculate(15, -10); });
            org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> { w.calculate(5, -2147483648); });
        }
}
