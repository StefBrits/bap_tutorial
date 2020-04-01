package be.uantwerpen.fti.se.tutorial.Model;

public class Transport {
    String type;
    String protocol;
    String address;
    int port;
    boolean publish;
    boolean host_server;

    public Transport() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public boolean isPublish() {
        return publish;
    }

    public void setPublish(boolean publish) {
        this.publish = publish;
    }

    public boolean isHost_server() {
        return host_server;
    }

    public void setHost_server(boolean host_server) {
        this.host_server = host_server;
    }
}
