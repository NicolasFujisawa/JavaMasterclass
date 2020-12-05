package learn.lecture;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return this.distance(new Point(0, 0));
    }

    public double distance(int x, int y) {
        return this.distance(new Point(x, y));
    }

    public double distance(Point point) {
        if (point == null) {
            return 0D;
        }
        return Math.sqrt(Math.pow((double) point.x - this.x, 2) + Math.pow((double) point.y - this.y, 2));
    }
}
