package network.exception.connect;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ConnectTimeoutMainV2 {

    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();


        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("192.168.1.250", 45678), 1000);
        } catch (IOException e) {
            e.printStackTrace();
        }


        long endTime = System.currentTimeMillis();
        System.out.println("end = " + (endTime - startTime));
    }
}