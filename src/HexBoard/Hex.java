package HexBoard;

import java.util.ArrayList;

public class Hex {
    public final int id;
    private int hexNumber;
    private Resource hexType;
    private ArrayList<Settlement> settlementList;

    public Hex(int id) {
        this.id = id;
        this.hexNumber = -1;
        this.hexType = null;
        this.settlementList = new ArrayList<>();
    }

    public Hex(int id, int hexNumber, Resource hexType) {
        this.id = id;
        this.hexNumber = hexNumber;
        this.hexType = hexType;
        this.settlementList = new ArrayList<>();
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

    public ArrayList<Settlement> getSettlerIDs() {
        return settlementList;
    }

    public void addSettler(Settlement settlement) {
        settlementList.add(settlement);
    }

    @Override
    public String toString() {
        String result = "";
        result += id + ":\t" + hexType + " " + hexNumber;
        for(Settlement s : settlementList) {
            result += "\n\t" + s;
        }
        result += "\n";
        return result;
    }
}
