package HexBoard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static HexBoard.Resource.*;

public class Board {
    private final int radius; //radius of board
    private final Hex[] hexArray; //array to hold the hex objects for the board
    private final Vertex[] vertexArray; //array to hold the vertex objects for the board
    private final Edge[] edgeArray; //array to hold the edge objects for the board
    private List<Integer>[] adjacencyList; //gets references to the edge array, but is much quicker to search

    /**
     * Creates a hexagonal board with a radius of 3
     */
    public Board() {
        this.radius = 3;
        this.hexArray = initHexes();
        this.vertexArray = initVertices();
        this.edgeArray = initEdges();
    }

    /**
     * Creates a hexagonal board with a radius of "radius"
     * @param radius number of rings on board
     */
    public Board(int radius) {
        this.radius = radius;
        this.hexArray = initHexes();
        this.vertexArray = initVertices();
        this.edgeArray = initEdges();
    }

    //@TODO: initialize the array of hexes based on radius
    /**
     * Initializes the array that holds the hex information of the board
     * @return the initialized hex array
     */
    private Hex[] initHexes() {
        //@TODO: Make variable to size
        //@TODO: Make numDesert variable to size as well
        List<Resource> resources = new ArrayList<>(Arrays.asList(WOOD, WOOD, WOOD, WOOD, BRICK, BRICK, BRICK, SHEEP, SHEEP, SHEEP, SHEEP, WHEAT, WHEAT, WHEAT, WHEAT, ORE, ORE, ORE, DESERT)); //Wood, Brick, Sheep, Wheat, Ore, Desert (use enum)
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,3,3,4,4,5,5,6,6,8,8,9,9,10,10,11,11,12,7)); //2-12
        int numHexes = (3*(radius-1)*(radius-1))+(3*(radius-1))+1;
        Hex[] hexes = new Hex[numHexes];

        Resource resource;
        int number;

        int numDesert = 1;
        int toGet;

        for(int i = 0; i < numHexes; i++) {
            toGet = (int)Math.floor(Math.random() * resources.size());
            resource = resources.remove(toGet);
            //keep same position if DESERT to get 7 as well (both should be at end)
            if(resource != DESERT) {
                toGet = (int)Math.floor(Math.random() * Math.max(numbers.size()-numDesert, 1));
            } else {
                numDesert--;
            }
            number = numbers.remove(toGet);
            hexes[i] = new Hex(i, number, resource);
        }

        return hexes;
    }

    //@TODO: initialize the array of vertices based on radius
    /**
     * Initializes the array that holds the vertex information of the board
     * @return the initialized vertex array
     */
    private Vertex[] initVertices() {
        int numVertices = radius*radius*6;
        Vertex[] vertices = new Vertex[numVertices];

        //Vertex should include adjacent hexes
        for(int i = 0; i < numVertices; i++) {
            vertices[i] = new Vertex(i);
        }

        return vertices;
    }

    //@TODO: initialize the edge array as well as the adjacency array based on radius
    /**
     * Initializes the array that holds the edge information of the board
     * @return the initialized edge array
     */
    private Edge[] initEdges() {
        int numEdges = 1;
        Edge[] edges = new Edge[numEdges];

        return edges;
    }

    /**
     * Getter for the radius
     * @return radius of board
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Getter for the hex array
     * @return array of hex information
     */
    public Hex[] getHexArray() {
        return hexArray;
    }

    /**
     * Getter for the vertex array
     * @return array of vertex information
     */
    public Vertex[] getVertexArray() {
        return vertexArray;
    }

    /**
     * Getter for the edge array
     * @return array of edge information
     */
    public Edge[] getEdgeArray() {
        return edgeArray;
    }

    /**
     * Getter for adjacency list
     * @return edge IDs listing adjacency
     */
    public List<Integer>[] getAdjacencyList() {
        return adjacencyList;
    }

    //@TODO: Add check for nearby settlements
    public void setBuilding(int vertexID, int settlerID, BuildingType buildingType) {
        ArrayList<Integer> hexIDs = vertexArray[vertexID].getHexIDs();
        Building b = new Building(vertexID, settlerID, buildingType);

        for(int i : hexIDs) {
            hexArray[i].setSettler(b);
        }
        vertexArray[vertexID].setBuildingType(b);
    }
}
