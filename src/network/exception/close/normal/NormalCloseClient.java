package network.exception.close.normal;

import java.io.*;
import java.net.Socket;

import static util.MyLogger.log;

public class NormalCloseClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        log("소켓 연결: " + socket);
        InputStream input = socket.getInputStream();

        //readByInputStream(input, socket);
        //readByBufferedReader(input, socket);
        readByDataInputStream(input, socket);

        log("연결 종료 " + socket.isClosed());
    }

    private static void readByInputStream(InputStream input, Socket socket) throws IOException {
        int read = input.read();
        log("read = " + read);

        if (read == -1) {
            input.close();
            socket.close();
        }
    }

    private static void readByBufferedReader(InputStream input, Socket socket) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String readString = reader.readLine();
        log("read = " + readString);

        if (readString == null) {
            reader.close();
            socket.close();
        }
    }

    private static void readByDataInputStream(InputStream input, Socket socket) throws IOException {
        DataInputStream reader = new DataInputStream(input);

        try {
            reader.readUTF();
        } catch (EOFException e) {
            log(e);
        } finally {
            reader.close();
            socket.close();
        }

    }
}
