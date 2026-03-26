public class BikeRace {
    String eventName;
    Cyclist[] participants;
    int nextToRegister;

    BikeRace(String eventName, int numberRacers) {
        this.eventName = eventName;
        this.participants = new Cyclist[numberRacers];
    }

    void registerCyclist(String name, double endurance, double sprint, double preparation) {
        if (nextToRegister > participants.length) {
            System.out.println("This race is full");
        } else {
            Cyclist newCyclist = new Cyclist(name, endurance, sprint, preparation);
            participants[nextToRegister] = newCyclist;
            nextToRegister++;
        }
    }

    void printDetails() {
        System.out.println("Event name: " + eventName);
        System.out.println("Participants:");

        for (int i = 0; i < nextToRegister; i++) {
            Cyclist cyclist = participants[i];

            System.out.println("- " + cyclist.name
                    + ", endurance: " + cyclist.endurance
                    + ", sprint: " + cyclist.sprintAbility
                    + ", preparation: " + cyclist.preparation
                    + ", race performance: " + cyclist.race());
        }
    }

    void userRegistration() {
        if (nextToRegister < participants.length) {

            System.out.println("REGISTER CYCLIST");
            System.out.println("----------------");
            System.out.println();

            System.out.println("- What is the cyclist's name?");
            String name = In.nextLine();

            System.out.println("- What is " + name + "'s endurance level (a number between 1 and 100)?");
            double endurance = In.nextDouble();

            System.out.println("- What is " + name + "'s sprint ability (a number between 1 and 100)?");
            double sprint = In.nextDouble();

            System.out.println("- How was " + name + "'s preparation (a number between 1 and 100)?");
            double preparation = In.nextDouble();

            participants[nextToRegister] = new Cyclist(name, endurance, sprint, preparation);
            nextToRegister++;

            System.out.println();
            System.out.println(name + " is now a registered participant of this race.");
        } else {
            System.out.println(" the Race is full");
            return;
        }
    }
}

class BikeRaceTest {
    public static void main(String[] args) {
        BikeRace race = new BikeRace("Tour de Sydney", 4);

        race.registerCyclist("Sam", 70, 20, 90);
        race.registerCyclist("Alex", 80, 60, 75);
        race.registerCyclist("Jamie", 65, 85, 88);

        race.printDetails();
        race.userRegistration();

        ;

    }
}
