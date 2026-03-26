public class Pokemon {
    String name;
    int level;
    String pokemonType;
    int health;

    Pokemon(String name, int level, String pokemonType) {
        this.name = name;
        this.level = level;
        this.pokemonType = pokemonType;
        this.health = 10 * this.level;

    }

    void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(this.name + " took " + damage + " damage.");
        System.out.println("Health is now : " + this.health);
    }

    void attack(Pokemon target) {
        int damage = this.level * 2;

        System.out.println(this.name + " attacks " + target);

        target.takeDamage(damage);

    }

    void takeheal(int heal) {
        this.health += heal;
        System.out.println(this.name + " healed himself " + heal + "++");
        System.out.println("Health is now: " + this.health);
    }

    public String toString() {
        return this.name + " (Type: " + this.pokemonType + ", Level: " + this.level + ", Health: " + this.health + ")";
    }
}

class PokemonTest {
    public static void main(String[] args) {

        Pokemon p1 = new Pokemon("Pikachu", 10, "Electric");
        Pokemon p2 = new Pokemon("Charmander", 8, "Fire");

        System.out.println(p1);
        System.out.println(p2);

        p1.attack(p2);
        p2.takeheal(10);
    }
}
