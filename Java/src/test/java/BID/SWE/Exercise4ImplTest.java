package BID.SWE;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class Exercise4ImplTest {

    Exercise4Impl e;

    @Test
    public void method1() throws IOException {
        e = new Exercise4Impl();
        assertEquals("Frohe Weihnachten 42 false", e.Method1().forEach(str -> str));
    }

    @Test
    public void method2() {
        e = new Exercise4Impl();
        assertEquals("Test", e.Method2(Object(Stream.of(42, false, "Test"))));
    }
}