/**
 * Created by petrstankevic on 12.10.15.
 */
public class Ship {
    int vert;
    int hor;
    int dimention;
    boolean vertikal;
    boolean dead;

    public int getDimention() {
        return dimention;
    }

    public int getVert() {
        return vert;
    }

    public void setVert(int vert) {
        this.vert = vert;
    }

    public int getHor() {
        return hor;
    }

    public void setHor(int hor) {
        this.hor = hor;
    }


    public boolean isVertikal() {
        return vertikal;
    }

    public void setVertikal(boolean vertikal) {
        this.vertikal = vertikal;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    void shoot(){
        System.out.println("Tra -Ta - Ta!!!");
    }
}
