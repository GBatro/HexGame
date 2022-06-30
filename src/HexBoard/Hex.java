package HexBoard;

import java.util.ArrayList;

public class Hex {
    StringBuilder sb = new StringBuilder();
    public final int id;
    private int hexNumber;
    private Resource hexType;
    private final ArrayList<Building> buildingList;

    public Hex(int id) {
        this.id = id;
        this.hexNumber = -1;
        this.hexType = null;
        this.buildingList = new ArrayList<>();
    }

    public Hex(int id, int hexNumber, Resource hexType) {
        this.id = id;
        this.hexNumber = hexNumber;
        this.hexType = hexType;
        this.buildingList = new ArrayList<>();
    }

    public void setHexNumber(int hexNumber) {
        this.hexNumber = hexNumber;
    }

    public int getHexNumber() {
        return hexNumber;
    }

    public void setHexType(Resource hexType) {
        this.hexType = hexType;
    }

    public ArrayList<Building> getSettlerIDs() {
        return buildingList;
    }

    public void addSettler(Building building) {
        buildingList.add(building);
    }

    @Override
    public String toString() {
        String result = "";
        result = sb.append(id).append(":\t").append(hexType).append(" ").append(hexNumber).toString();
        for(Building s : buildingList) {
            result = sb.append("\n\t").append(s).toString();
        }
        result = sb.append("\n").toString();
        return result;
    }
}
