package be.uantwerpen.fti.se.tutorial.Model;

public class Transport {
    String type;
    String protocol;
    String address;
    int port;
    boolean publish;
    boolean host_server;

    public Transport(String type) {
        this.type = type;
    }
}
