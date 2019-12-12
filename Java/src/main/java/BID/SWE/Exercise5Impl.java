package BID.SWE;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.LinkedList;

public class Exercise5Impl implements Exercise5 {

    @Override
    public Object Method1(String s, int i) {
        LinkedList<String> list = new LinkedList<>();
        String singleLine = null;

        try {
            Socket socket = new Socket(s, i);
            InputStreamReader inS = new InputStreamReader(socket.getInputStream());
            BufferedReader bufR = new BufferedReader(inS);

            while (bufR.readLine() != null) {
                list.add(bufR.readLine());
            }

            return list;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
