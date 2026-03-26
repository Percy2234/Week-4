public class Week4TutorialA1 {
    public static void main(String[] args) {
        Point p1 = new Point(3, 5);
        System.out.println(p1);
        System.out.println("Upper? " + p1.inUpperHalfPlane());
        System.out.println("First quadrant? " + p1.inFirstQuadrant());
        System.out.println("Quadrant 1? " + p1.isInQuadrant(1));
        System.out.println("Distance 2: " + p1.squaredDistance());
        // 이렇게 해도 됨
    }

}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean inUpperHalfPlane() {
        return this.y >= 0;
    }

    boolean inFirstQuadrant() {
        return this.x > 0 && this.y > 0;
    }

    boolean isInQuadrant(int quadrantNumber) {
        if (quadrantNumber == 1) {
            return this.x > 0 && this.y > 0;
        } else if (quadrantNumber == 2) {
            return this.x < 0 && this.y > 0;
        } else if (quadrantNumber == 3) {
            return this.x < 0 && this.y < 0;
        } else if (quadrantNumber == 4) {
            return this.x > 0 && this.y < 0;
        } else {
            return false;
        }
    }

    double squaredDistance() {
        return this.x * this.x + this.y * this.y;
    }

    public String toString() {
        return "P( " + this.x + "," + this.y + ")";
    }
}