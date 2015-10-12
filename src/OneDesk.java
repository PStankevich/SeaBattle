/**
 * Created by petrstankevic on 12.10.15.
 */
public class OneDesk extends Ship {
    int dimention = 1;

    public int getDimention() {
        return dimention;
    }

    void shoot(){
        System.out.println("Bang!!!");
    }
}
