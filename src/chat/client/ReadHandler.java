package chat.client;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

import static util.MyLogger.log;

public class ReadHandler implements Runnable {

    private final DataInputStream input;
    private final Client client;
    private boolean isClosed = false;

    public ReadHandler(DataInputStream input, Client client) {
        this.input = input;
        this.client = client;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String received = input.readUTF();
                System.out.println(received);
            }
        } catch (IOException e) {
            log(e);
        } finally {
            client.close();
        }
    }

    public synchronized void close() {
        if (isClosed) {
            return;
        }

        isClosed = true;
        log("readHandler closed");
    }
}
