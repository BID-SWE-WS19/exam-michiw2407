package BID.SWE;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class Exercise1ImplTest {

    Exercise1Impl e;

    @Test
    public void printState() {
        e = new Exercise1Impl();
        assertEquals("Cell rot born on 01.02.18 is alive", e.PrintState(true, new Date(2018, 1, 1), "rot"));
    }

    @Test
    public void printPostion() {
        e = new Exercise1Impl();
        assertEquals("Cell is on Position X:6 Y:7", e.PrintPostion(6, 7));

    }
}