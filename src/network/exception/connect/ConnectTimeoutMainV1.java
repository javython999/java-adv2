package network.exception.connect;

import java.io.IOException;
import java.net.Socket;

public class ConnectTimeoutMainV1 {

    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();


        try {
            Socket socket = new Socket("192.168.1.250", 45678);
        } catch (IOException e) {
            e.printStackTrace();
        }


        long endTime = System.currentTimeMillis();
        System.out.println("end = " + (endTime - startTime));
    }
}