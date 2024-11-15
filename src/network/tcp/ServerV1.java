package network.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static util.MyLogger.log;

public class ServerV1 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("서버 시작");
        log("서버 소켓 시작 - 리스닝 포트: " + PORT);

        try (ServerSocket serverSocket = new ServerSocket(PORT);
             Socket socket = serverSocket.accept();
             DataInputStream input = new DataInputStream(socket.getInputStream());
             DataOutputStream output = new DataOutputStream(socket.getOutputStream())) {
            log("소켓 연결: " + socket);

            String received = input.readUTF();
            log("client -> server: " + received);

            String toSend = received + " World!";
            output.writeUTF(toSend);
            log("client <- server: " + toSend);
            log("연결 종료: " + socket);
        }
    }
}
