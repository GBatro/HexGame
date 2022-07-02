package HexBoard;

import java.util.ArrayList;

public class Vertex {
    public final int id;
    private Building building;
    private Port port;
    private final ArrayList<Integer> hexIDList;

    public Vertex(int id) {
        this.id = id;
        this.building = null;
        this.port = null;
        this.hexIDList = new ArrayList<>();
    }

    public Vertex(int id, Port port) {
        this.id = id;
        this.building = null;
        this.port = port;
        this.hexIDList = new ArrayList<>();
    }

    //@TODO: Update how buildings are added to vertices and how IDs are set
    public Building getBuilding() {
        return building;
    }

    public void setBuildingType(Building building) {
        this.building = building;
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
