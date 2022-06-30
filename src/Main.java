import HexBoard.Building;
import HexBoard.Hex;
import HexBoard.Settlement;

import static HexBoard.Building.*;
import static HexBoard.Resource.*;

public class Main {
    public static void main(String[] args) {
        hexTests();
    }

    public static void hexTests() {
        Hex hex1 = new Hex(1, 8, WOOD);
        Hex hex2 = new Hex(2, 6, BRICK);
        Hex hex3 = new Hex(3);
        hex2.addSettler(new Settlement(4));
        hex2.addSettler(new Settlement(3, CITY));
        System.out.print(hex1);
        System.out.print(hex2);
        System.out.print(hex3);
    }
}