package BID.SWE;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class Exercise3ImplTest {

    Exercise3Impl e;

    @Test
    public void getMapName() {
        e = new Exercise3Impl();
        assertEquals("BID-Map", e.GetMapName());

    }

    @Test
    public void getMapSize() {
        e = new Exercise3Impl();
        assertEquals(16.0f, e.GetMapSize(4.0f), 0.0002);
    }

    @Test
    public void addNewCells() {
        e = new Exercise3Impl();
        assertEquals(2, e.AddNewCells(2));

    }
}