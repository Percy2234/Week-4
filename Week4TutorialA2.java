public class Week4TutorialA2 {
    public static void main(String[] args) {
        BunchOfPoints bunch = new BunchOfPoints(10);

        System.out.println(bunch.numberFurtherThan(160.0)); // Answer: 4
    }
}
// Point[] points = new Point[3];
// for (int i = 0; i < points.length; i++)
// points[i] = new Point(i + 1, i + 1);
// for (int i = 0; i < points.length; i++) {// Point p : points foreach
// System.out.println(points[i]);

// change to main

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double squaredDistance() {
        return this.x * this.x + this.y * this.y;
    }

    public String toString() {
        return "P(" + this.x + ", " + this.y + ")";
    }
}

class BunchOfPoints {
    Point[] points;

    BunchOfPoints(int n) {
        this.points = new Point[n];

        // (0,0)으로 초기화
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(0, 0);
        }
    }

    Point getPoint(int i) {
        return this.points[i];
    }

    void setPoint(int i, double newX, double newY) {
        this.points[i] = new Point(newX, newY);
    }

    int numberFurtherThan(double squaredDistance) {
        int count = 0;

        for (Point p : this.points) {
            if (p.squaredDistance() > squaredDistance) {
                count++;
            }
        }

        return count;
    }
}
