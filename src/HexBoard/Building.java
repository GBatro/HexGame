package HexBoard;

import static HexBoard.BuildingType.*;

public class Building {
    public final int id;
    private int settlerID;
    private BuildingType buildingType;

    public Building(int id, int settlerID) {
        this.id = id;
        this.settlerID = settlerID;
        this.buildingType = null;
    }

    public Building(int id, int settlerID, BuildingType building) {
        this.id = id;
        this.settlerID = settlerID;
        this.buildingType = building;
    }

    public int getSettlerID() {
        return settlerID;
    }

    public void setSettlerID(int settlerID) {
        this.settlerID = settlerID;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
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
