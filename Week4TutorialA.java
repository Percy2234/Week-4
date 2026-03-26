public class Week4TutorialA {
    public static void main(String[] args) {
        Person p1 = new Person("Percy", "Kim", 20, true);
        System.out.println(p1);
        System.out.println("Is adualt?" + p1.isAdult());

    }
}

class Person {
    String firstName;
    String lastName;
    int age;
    boolean isStudent;

    Person(String firstName, String lastName, int age, boolean isStudent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isStudent = isStudent;
    }

    boolean isAdult() {
        return this.age >= 18;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + ", age: " + this.age + "Is";
    }
}
