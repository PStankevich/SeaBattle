/**
 * Created by petrstankevic on 12.10.15.
 */
public class ThreeDesk extends Ship {
    int dimention = 3;
    void shoot(){
        System.out.println("Bang - Bang - Bang!!!");
    }

    @Override
    public int getDimention() {
        return dimention;
    }
}
