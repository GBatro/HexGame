package HexBoard;

import java.util.List;

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

    private Hex[] initHexes() {
        //@TODO: initialize the array of hexes based on radius
        int numHexes = -1;
        Hex[] hexes = new Hex[numHexes];
        return hexes;
    }

    private Vertex[] initVertices() {
        //@TODO: initialize the array of vertices based on radius
        int numVertices = -1;
        Vertex[] vertices = new Vertex[numVertices];
        return vertices;
    }

    private Edge[] initEdges() {
        //@TODO: initialize the edge array as well as the adjacency array based on radius
        int numEdges = -1;
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
