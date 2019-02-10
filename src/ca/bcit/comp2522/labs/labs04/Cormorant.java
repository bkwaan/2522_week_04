package ca.bcit.comp2522.labs.labs04;

/**
 * Cormorant.
 * @author Bosco
 * @version 2019
 */

/**
 * Creates a Cormorant and it's behaviours.
 */
public class Cormorant implements Aerial,Aquatic,Terrestrial,Eater {

    /**
     * Prints out when a Cormorant is swimming.
     */
    @Override
    public void swim(){
        System.out.println("This Comorant is swimming!");

    }

    /**
     * Prints out when a Cormorant is flying.
     */
    @Override
    public void fly(){
        System.out.println("This Cormorant is flying!");
    }

    /**
     * Prints out when a Cormorant is walking.
     */
    @Override
    public void walk(){
        System.out.println("This Cormorant is walking!");
    }

    /**
     * Prints out when a Cormorant is eating.
     */
    @Override
    public void eat(){
        System.out.println("Cormorants eat fish!");
    }

}
