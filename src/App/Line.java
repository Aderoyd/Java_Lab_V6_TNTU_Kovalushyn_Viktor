import java.awt.Point;

public class Line {
    private Point A;
    private Point B;

    public Line(Point A, Point B) {
        this.A = A;
        this.B = B;
    }

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public boolean intersects(Line other) {
        int o1 = orientation(A, B, other.A);
        int o2 = orientation(A, B, other.B);
        int o3 = orientation(other.A, other.B, A);
        int o4 = orientation(other.A, other.B, B);

        if (o1 != o2 && o3 != o4) return true;
        return false;
    }

    public boolean coincides(Line other) {
        return orientation(A, B, other.A) == 0 && orientation(A, B, other.B) == 0;
    }

    private int orientation(Point p, Point q, Point r) {
        int val = (q.y - p.y) * (r.x - q.x) - (q.x - p.x) * (r.y - q.y);
        if (val == 0) return 0;
        return (val > 0) ? 1 : 2;
    }
}