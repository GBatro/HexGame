package HexBoard;

import java.util.ArrayList;

public class Vertex {
    public final int id;
    private Building building;
    private Port port;
    private final ArrayList<Integer> hexIDList;

    /**
     * Creates a vertex object with no information other than an ID
     * @param id ID of vertex
     */
    public Vertex(int id) {
        this.id = id;
        this.building = null;
        this.port = null;
        this.hexIDList = new ArrayList<>();
    }

    /**
     * Creates a vertex object with a port and ID
     * @param id ID of vertex
     * @param port port on vertex
     */
    public Vertex(int id, Port port) {
        this.id = id;
        this.building = null;
        this.port = port;
        this.hexIDList = new ArrayList<>();
    }

    /**
     * Getter for building on vertex
     * @return building on vertex
     */
    public Building getBuilding() {
        return building;
    }

    /**
     * Setter for building on vertex
     * @param building building on vertex
     */
    public void setBuildingType(Building building) {
        this.building = building;
    }

    /**
     * Getter for port on vertex
     * @return port on vertex
     */
    public Port getPort() {
        return port;
    }

    /**
     * Setter for port on vertex
     * @param port port to add
     */
    public void setPort(Port port) {
        this.port = port;
    }

    /**
     * Getter for list of hex IDs
     * @return list of hex IDs
     */
    public ArrayList<Integer> getHexIDs() {
        return hexIDList;
    }

    /**
     * Adds a hex ID to the hex ID list
     * @param hexID ID of hex to add
     */
    public void addHexID(int hexID) {
        this.hexIDList.add(hexID);
    }
}
