package ca.bcit.comp2522.labs.labs04;

/**
 * Ecosystem.
 * @author Bosco
 * @version 2019
 */
public class Ecosystem {

    public static void main(String[] args){
        Eater newEater;
        newEater = new Cormorant();
        newEater.eat();
        newEater = new Human();
        newEater.eat();
        ((Human) newEater).walk();
    }
}
