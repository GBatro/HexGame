import HexBoard.Board;
import HexBoard.Hex;
import HexBoard.Building;

import static HexBoard.BuildingType.*;
import static HexBoard.Resource.*;

public class Main {
    public static void main(String[] args) {
        //hexTests();
        boardTests();
    }

    public static void hexTests() {
        Hex hex1 = new Hex(1, 8, WOOD);
        Hex hex2 = new Hex(2, 6, BRICK);
        Hex hex3 = new Hex(3);
        hex2.setSettler(new Building(0,4));
        hex2.setSettler(new Building(1,3, CITY));
        System.out.print(hex1);
        System.out.print(hex2);
        System.out.print(hex3);
    }

    public static void boardTests() {
        Board board = new Board();
        Hex[] hexes = board.getHexArray();
        for(Hex h : hexes) {
            System.out.println(h);
        }
    }
}
