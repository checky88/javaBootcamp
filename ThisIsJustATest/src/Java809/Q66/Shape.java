package Java809.Q66;

/**
 * Created by KellyR on 25/10/2017.
 */
public abstract class Shape {
    private int x;
    private int y;
    public abstract void draw();
    public void setAnchor(int x, int y) {
        this.x = x;
        this.x = y;
    }
}