package be.uantwerpen.fti.se.tutorial.Model;

import java.util.ArrayList;

public class Link {
    ArrayList<Channel> channels;
    String name = "linkname";

    public Link() {
    }

    public ArrayList<Channel> getChannels() {
        return channels;
    }

    public void setChannels(ArrayList<Channel> channels) {
        this.channels = channels;
    }

    public void addChannel(Channel channel) {
        this.channels.add(channel);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
