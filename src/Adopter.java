import java.util.ArrayList;

public class Adopter {
    String name;
    String petPreference;

    public Adopter(String name, String petPreference) {
        this.name = name;
        this.petPreference = petPreference;
    }
    public void petMatchFind(ArrayList<Pet> pets) {
        boolean foundMatch = false;
        for (Pet pet : pets) {
            if (this.petPreference.equalsIgnoreCase("dog") && pet instanceof Dog) {
                System.out.println("Found a match! " + pet);
                foundMatch = true;

                // 2. Fill in the "cat" condition (copy the pattern from above!)
            } else if (this.petPreference.equalsIgnoreCase("cat") && pet instanceof Cat) {

                 // Print a "Found a match!" message
                System.out.println("Found a match! " + pet);
                foundMatch = true;

                // 3. Fill in the "any" condition (this one is simpler!)
            } else if (this.petPreference.equalsIgnoreCase("any"))  {

                 // Print a "Found a match!" message
                System.out.println("Found a match! " + pet);
                foundMatch = true;
            }
        }

        // Let's add a message if no matches were found
        if (!foundMatch) {
            System.out.println("Sorry, no matches found for your preference.");
        }
    }
    }

