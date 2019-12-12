package BID.SWE;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

public class Exercise4Impl implements Exercise4 {

    @Override
    public Stream Method1() {
        return Stream.of("Frohe Weihnachten", 42, false);
    }


    @Override
    public String Method2(Object inpStream) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream) inpStream, StandardCharsets.UTF_8));
            String methodLine = null;
            methodLine = reader.readLine();

            if (methodLine == null) {
                return null;
            }

            String[] segment = methodLine.split(" ", 3);

            return segment[3];
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
