import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Simon", 2);
        Dog dog2 = new Dog("Betty", 3);
        Dog dog3 = new Dog("Bernard", 4);
        Cat cat1 = new Cat("Lola", 1, "clay");
        Cat cat2 = new Cat("Sofia", 10, "pine");
        ArrayList<Pet> availablePets = new ArrayList<Pet>();
        availablePets.add(dog1);
        availablePets.add(dog2);
        availablePets.add(dog3);
        availablePets.add(cat1);
        availablePets.add(cat2);

        System.out.println("--- Welcome to the Adoption Center! ---");
        System.out.println("We have " + availablePets.size() + " pets available:");
        for (Pet pet : availablePets) {
            System.out.println("  * " + pet); // Uses your custom toString()!
        }
        System.out.println("---------------------------------------");

        // --- Step 4: Create Adopters ---
        Adopter adopter1 = new Adopter("Ali", "dog");
        Adopter adopter2 = new Adopter("Aisha", "cat");
        Adopter adopter3 = new Adopter("Zane", "any");
        Adopter adopter4 = new Adopter("Maria", "lizard"); // To test no matches

        // --- Step 5: Run the Matchmaking! ---
        adopter1.petMatchFind(availablePets);
        System.out.println("---------------------------------------");
        adopter2.petMatchFind(availablePets);
        System.out.println("---------------------------------------");
        adopter3.petMatchFind(availablePets);
        System.out.println("---------------------------------------");
        adopter4.petMatchFind(availablePets);
        System.out.println("---------------------------------------");

    } // <-- The main method's brace closes HERE!

} // <-- The class's brace closes HERE!

