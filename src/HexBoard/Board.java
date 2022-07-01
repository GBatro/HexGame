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
    private List<Integer>[] adjacencyArray; //gets references to the edge array, but is much quicker to search

    public Board() {
        this.radius = 3;
        this.hexArray = initHexes();
        this.vertexArray = initVertices();
        this.edgeArray = initEdges();
    }

    public Board(int radius) {
        this.radius = radius;
        this.hexArray = initHexes();
        this.vertexArray = initVertices();
        this.edgeArray = initEdges();
    }

    //@TODO: initialize the array of hexes based on radius
    private Hex[] initHexes() {
        //@TODO: Make variable to size
        //@TODO: Tie 7 to Desert
        List<Resource> resources = new ArrayList<>(Arrays.asList(WOOD, WOOD, WOOD, WOOD, BRICK, BRICK, BRICK, SHEEP, SHEEP, SHEEP, SHEEP, WHEAT, WHEAT, WHEAT, WHEAT, ORE, ORE, ORE, DESERT)); //Wood, Brick, Sheep, Wheat, Ore, Desert (use enum)
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,3,3,4,4,5,5,6,6,7,8,8,9,9,10,10,11,11,12)); //2-12
        int numHexes = (3*(radius-1)*(radius-1))+(3*(radius-1))+1;
        Hex[] hexes = new Hex[numHexes];

        Resource resource;
        int number;

        for(int i = 0; i < numHexes; i++) {
            resource = resources.remove((int)Math.floor(Math.random() * resources.size()));
            number = numbers.remove((int)Math.floor(Math.random() * numbers.size()));
            hexes[i] = new Hex(i, number, resource);
        }

        return hexes;
    }

    //@TODO: initialize the array of vertices based on radius
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
    private Edge[] initEdges() {
        int numEdges = 1;
        Edge[] edges = new Edge[numEdges];

        return edges;
    }

    public int getRadius() {
        return radius;
    }

    public Hex[] getHexArray() {
        return hexArray;
    }

    public Vertex[] getVertexArray() {
        return vertexArray;
    }

    public Edge[] getEdgeArray() {
        return edgeArray;
    }

    public List<Integer>[] getAdjacencyArray() {
        return adjacencyArray;
    }
}
