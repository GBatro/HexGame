package HexBoard;

import static HexBoard.BuildingType.ROAD;

public class Edge {

    private final int vertex1;
    private final int vertex2;
    private Building road;

    public Edge(int vertex1, int vertex2) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.road = null;
    }

    public int getVertex1() {
        return vertex1;
    }

    public int getVertex2() {
        return vertex2;
    }

    public Building getRoad() {
        return road;
    }

    public void addRoad(int settlerID) {
        this.road = new Building(settlerID, ROAD);
    }
}
