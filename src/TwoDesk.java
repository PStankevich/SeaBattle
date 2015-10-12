/**
 * Created by petrstankevic on 12.10.15.
 */
public class TwoDesk extends Ship {
    int dimention = 2;
    void shoot(){
        System.out.println("Bang - Bang!!!");
    }

    @Override
    public int getDimention() {
        return dimention;
    }
}
