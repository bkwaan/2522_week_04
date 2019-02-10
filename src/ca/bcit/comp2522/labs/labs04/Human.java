package ca.bcit.comp2522.labs.labs04;

/**
 * Human.
 * @author Bosco
 * @version 2019
 */

public class Human implements Terrestrial,Aquatic,Eater {

    /**
     * Prints out when human is swimming.
     */
    @Override
    public void swim() {
        System.out.println("This human is swimming!");
    }

    /**
     * Prints out when human is walking.
     */
    @Override
    public void walk() {
        System.out.println("This human is walking!");
    }

    /**
     * Prints out when human is eating.
     */
    @Override
    public void eat(){
        System.out.println("Humans eat meat!");
    }
}
