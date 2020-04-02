package be.uantwerpen.fti.se.tutorial.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Link {
    @SerializedName("channel")
    @Expose
    ArrayList<Channel> channels = new ArrayList<>();


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
}
