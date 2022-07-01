package HexBoard;

import java.util.ArrayList;

public class Hex {
    StringBuilder sb = new StringBuilder();
    public final int id;
    private int hexNumber;
    private Resource hexType;
    private final ArrayList<Building> buildingList;

    /**
     * Creates a hex object with no information other than an ID
     * @param id ID of hex
     */
    public Hex(int id) {
        this.id = id;
        this.hexNumber = -1;
        this.hexType = null;
        this.buildingList = new ArrayList<>();
    }

    /**
     * Creates a hex object with an associated number and resource hex type
     * @param id ID of hex
     * @param hexNumber number associated with the produce
     * @param hexType resource associated with the produce
     */
    public Hex(int id, int hexNumber, Resource hexType) {
        this.id = id;
        this.hexNumber = hexNumber;
        this.hexType = hexType;
        this.buildingList = new ArrayList<>();
    }

    /**
     * Setter for hex number
     * @param hexNumber number associated with hex production
     */
    public void setHexNumber(int hexNumber) {
        this.hexNumber = hexNumber;
    }

    /**
     * Getter for hex number
     * @return number associated with hex production
     */
    public int getHexNumber() {
        return hexNumber;
    }

    /**
     * Setter for hex type
     * @param hexType resource associated with hex production
     */
    public void setHexType(Resource hexType) {
        this.hexType = hexType;
    }

    /**
     * Getter for hex type
     * @return resource associated with hex production
     */
    public ArrayList<Building> getSettlerIDs() {
        return buildingList;
    }

    /**
     * Adds an adjacent settler building to the hex
     * @param building settler ID with building type
     */
    public void addSettler(Building building) {
        buildingList.add(building);
    }

    //@TODO: Add updateSettler method or adjust addSettler method using building ID

    @Override
    public String toString() {
        String result = sb.append(id).append(":\t").append(hexType).append(" ").append(hexNumber).toString();
        for(Building s : buildingList) {
            result = sb.append("\n\t").append(s).toString();
        }
        result = sb.append("\n").toString();
        return result;
    }
}
