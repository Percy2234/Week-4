public class Cyclist {
    String name;
    double endurance;
    double sprintAbility;
    double preparation;

    Cyclist(String name, double endurance, double sprintAbility, double preparation) {
        this.name = name;
        this.endurance = endurance;
        this.sprintAbility = sprintAbility;
        this.preparation = preparation;
    }

    double race() {
        return 0.5 * preparation
                + 0.25 * endurance
                + 0.25 * sprintAbility;

    }

    public String toString() {
        return this.name + " " + "enurance: " + this.endurance + ", sprint ability " + this.sprintAbility
                + " prepartion " + preparation;
    }
}

class CyclistTest {
    public static void main(String[] args) {
        Cyclist c1 = new Cyclist("Percy", 80, 70, 90);

        double performance = c1.race();
        System.out.println(c1);

        System.out.println("Performance: " + performance);
    }
}