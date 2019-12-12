package BID.SWE;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class Exercise2ImplTest {

    Exercise2Impl e;

    @Test
    public void grow() {
        e = new Exercise2Impl();
        assertEquals(2, e.Grow());
    }

    @Test
    public void method3() {
        e = new Exercise2Impl();
        assertTrue("WRONG", e.Method3(4));
        assertEquals(false, e.Method3(5));
    }
}