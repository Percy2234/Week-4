public class Week4 {
    public static void main(String[] args) {
        VideoGame marioKart = new VideoGame("Mario Kart", 109.99);
        System.out.println(marioKart);
        marioKart.applyDiscount(9.99);
        System.out.println(marioKart);
    }
}

class VideoGame {
    String name;
    double price;

    VideoGame(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void startGame() {
        System.out.println("The game " + this.name + " has started.");
    }

    void stopGame() {
        System.out.println("The game " + this.name + " has stopped.");
    }

    void playGame() {
        System.out.println("Playing the game " + this.name + ".");
    }

    void applyDiscount(double discount) {
        this.price -= discount;

    }

    public String toString() {
        return "Name: " + this.name + " , Price : $" + this.price;
    }
}