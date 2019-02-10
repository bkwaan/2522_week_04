package ca.bcit.comp2522.labs.labs04;

/**
 * Gopher.
 * @author Bosco
 * @version 2019
 */

/**
 * Constructs a Gopher and it's actions.
 */
public class Gopher implements Subteranean {

    /**
     * Prints out when a Gopher is crawling.
     */
    @Override
    public void crawl(){
        System.out.println("This Gopher is crawling!");
    }

    /**
     * Prints out when a Gopher is walking.
     */
    @Override
    public void walk(){
        System.out.println("This Gopher is crawling!");
    }
}
