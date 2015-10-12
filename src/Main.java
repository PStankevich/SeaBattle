import java.util.Random;

/**
 * Created by petrstankevic on 12.10.15.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Ship[] ships = new Ship[10];
        ships[0] = new OneDesk();
        ships[1] = new OneDesk();
        ships[2] = new OneDesk();
        ships[3] = new OneDesk();
        ships[4] = new TwoDesk();
        ships[5] = new TwoDesk();
        ships[6] = new TwoDesk();
        ships[7] = new ThreeDesk();
        ships[8] = new ThreeDesk();
        ships[9] = new FourDesk();

        for (int i = 0; i < ships.length; i++) {
//            System.out.print(ships[i].getDimention() + "  ");
//            ships[i].shoot();
            ships[i].setHor((random.nextInt(10) + 1));
            ships[i].setVert((random.nextInt(10) + 1));
            ships[i].setVertikal(random.nextBoolean());
            System.out.println(ships[i].getHor());
            System.out.println(ships[i].getVert());
            System.out.println(ships[i].isVertikal());
            System.out.println(".......................");
        }
    }
}
