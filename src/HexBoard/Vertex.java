package HexBoard;

import java.util.ArrayList;

public class Vertex {
    public final int id;
    private int settlerID;
    private Port port;
    private ArrayList<Integer> hexIDList;

    public Vertex(int id) {
        this.id = id;
        this.settlerID = -1;
        this.port = null;
        this.hexIDList = new ArrayList<>();
    }

    public Vertex(int id, Port port) {
        this.id = id;
        this.settlerID = -1;
        this.port = port;
        this.hexIDList = new ArrayList<>();
    }

    public int getSettlerID() {
        return settlerID;
    }

    public void setSettlerID(int settlerID) {
        this.settlerID = settlerID;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }

    public ArrayList<Integer> getHexIDs() {
        return hexIDList;
    }

    public void addHexID(int hexID) {
        this.hexIDList.add(hexID);
    }
}
