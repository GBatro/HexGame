package HexBoard;

import static HexBoard.Building.*;

public class Settlement {
    private int settlerID;
    private Building buildingType;

    public Settlement(int settlerID) {
        this.settlerID = settlerID;
        this.buildingType = SETTLEMENT;
    }

    public Settlement(int settlerID, Building building) {
        this.settlerID = settlerID;
        this.buildingType = building;
    }

    public int getSettlerID() {
        return settlerID;
    }

    public void setSettlerID(int settlerID) {
        this.settlerID = settlerID;
    }

    public Building getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(Building buildingType) {
        this.buildingType = buildingType;
    }

    public void upgradeSettlement() {
        this.buildingType = CITY;
    }

    @Override
    public String toString() {
        return "Player " + settlerID + ": " + buildingType;
    }
}
