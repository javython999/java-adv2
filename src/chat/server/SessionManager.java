package chat.server;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static util.MyLogger.log;

public class SessionManager {

    private final List<Session> sessions = new ArrayList<>();

    public void add(Session session) {
        sessions.add(session);
    }

    public void remove(Session session) {
        sessions.remove(session);
    }

    public synchronized void closeAll() {
        for (Session session : sessions) {
            session.close();
        }
        sessions.clear();
    }

    public void sendAll(String message) {
        for (Session session : sessions) {
            try {
                session.send(message);
            } catch (IOException e) {
                log(e);
            }
        }
    }

    public synchronized List<String> getAllUsername() {
        List<String> username = new ArrayList<>();
        for (Session session : sessions) {
            if (session.getUsername() != null) {
                username.add(session.getUsername());
            }
        }
        return username;
    }
}
