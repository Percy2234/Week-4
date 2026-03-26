class Square {
    int width;

    Square(int width) {
        this.width = width;
    }

    int getArea() {
        return this.width * this.width;
    }

    boolean isAreaGreaterThan(int area) {
        return this.getArea() > area;
    }

    int getPerimeter() {
        return 4 * this.width;
    }

    boolean isPerimeterGreaterThan(int perimeter) {
        return this.getPerimeter() > perimeter;
    }

    public String toString() {
        return "Square with width " + this.width;
    }
}

class SquareTest {
    public static void main(String[] args) {
        Square sq = new Square(10);

        System.out.println("Perimeter: " + sq.getPerimeter());
        System.out.println("Is perimeter greater than 30? " + sq.isPerimeterGreaterThan(30));
        System.out.println("Is perimeter greater than 40? " + sq.isPerimeterGreaterThan(40));
    }
}