package Aufgabe4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


public class wasserkostenTest {
        wasserkosten w;

        @Test
        void testCalc() {
                wasserkostenCalc wc = mock(wasserkostenCalc.class);
                when(wc.calculate(12, 1)).thenReturn(10.0);
                wasserkosten w = new wasserkosten(wc);
                Assertions.assertEquals(219.79, w.calc(12,1));
        }
}
