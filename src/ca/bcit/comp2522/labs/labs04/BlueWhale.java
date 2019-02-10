package ca.bcit.comp2522.labs.labs04;

/**
 * BlueWhale.
 * @author Bosco
 * @version 2019
 */

public class BlueWhale implements Aquatic, Eater {

    private double lengthInMetres;

    /**
     * Creates a blue whale based on the length.
     * @param lengthInMetres the length in metres
     */
    public BlueWhale(double lengthInMetres) {
        this.lengthInMetres = lengthInMetres;
    }

    /**
     * Prints out if whale is swimming.
     */
    @Override
    public void swim(){
        System.out.println("This blue whale is swimming!");
    }

    /**
     * Prints out what whales eat.
     */
    @Override
    public void eat(){
        System.out.println("Whales eat fish!");
    }

    /**
     * Compares two objects of BlueWhale.
     * @param obj1 an object of BlueWhale
     * @return an int after comparing
     */
    public int compareTo(Object obj1){
        BlueWhale obj2 = (BlueWhale) obj1;
        if(this.lengthInMetres < obj2.lengthInMetres ){
            return -1;
        }
        if(this.lengthInMetres < obj2.lengthInMetres){
            return 1;
        }
        return 0;
    }
}
