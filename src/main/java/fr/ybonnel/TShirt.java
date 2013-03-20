package fr.ybonnel;

import static fr.ybonnel.simpleweb4j.SimpleWeb4j.*;

/**
 * Main class.
 */
public class TShirt {


    /**
     * Start the server.
     * @param port http port to listen.
     * @param waitStop true to wait the stop.
     */
    public static void startServer(int port, boolean waitStop) {
        // Set the http port.
        setPort(port);
        // Set the path to static resources.
        setPublicResourcesPath("/fr/ybonnel/public");

        // Start the server.
        start(waitStop);
    }

    public static void main(String[] args) {
        // Default port 9999.
        // For main, we want to wait the stop.
        int port =
                Integer.getInteger("app.port", // Cloudbees
                Integer.getInteger("PORT", // Heroku
                9999));
        startServer(port, true);
    }
}
