import java.util.Scanner;
/**
 * @author Iker Perez-Calderon
 * @version 1/20/2022
 */

public class PetsTester {
    public static void main(String[] args) {
        // Part A
        Pets pet1 = new Pets("Samantha", "cat", 5);
        Pets pet2 = new Pets("Kelson", "dog", 2);

        System.out.println("Animal name: " + pet1.getName() + "\tAnimal breed: " + pet1.getBreed() + "\tAnimal age: " + pet1.getAge());
        System.out.println("Animal name: " + pet2.getName() + "\tAnimal breed: " + pet2.getBreed() + "\tAnimal age: " + pet2.getAge());
        System.out.println("Part A");
        System.out.println();

        // Part B
        Pets pet3 = new Pets();
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while(run == true) {
            run = false;
            String name;
            String breed;
            int age;
            String decision;

            System.out.print("What is the name of your pet? ");
            name = input.next();
            System.out.println();
            System.out.print("What breed is your pet? ");
            breed = input.next();
            System.out.println();
            System.out.print("What is the age of your pet? ");
            age = input.nextInt();
            System.out.println();

            pet3.setName(name);
            pet3.setBreed(breed);
            pet3.setAge(age);

            System.out.println("Pet name: " + pet3.getName() + "\tPet breed: " + pet3.getBreed() + "\tPet age: " + pet3.getAge());
            System.out.println();
            System.out.print("Would you like to go again? (y/n)");
            decision = input.next();
            if (decision.equalsIgnoreCase("y")) {
                run = true;
            }
        }
        input.close();
    }
}
