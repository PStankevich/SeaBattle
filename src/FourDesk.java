/**
 * Created by petrstankevic on 12.10.15.
 */
public class FourDesk extends Ship {
    int dimention = 4;

    void shoot(){
        System.out.println("Bang - Bang - Bang - Bang!!!");
    }

    @Override
    public int getDimention() {
        return dimention;
    }
}
