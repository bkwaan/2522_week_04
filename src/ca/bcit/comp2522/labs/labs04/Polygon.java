package ca.bcit.comp2522.labs.labs04;

/**
 * Polygon.
 * @author Bosco
 * @version 2019
 */

/**
 * Creates a shape Polygon along with the area and perimeter.
 */
public class Polygon extends Shape2D {
    protected int numberOfSides;

    public Polygon(int numberOfSides){
        this.numberOfSides = numberOfSides;
    }

    /**
     * Draws the shape polygon.
     */
    @Override
    public void draw(){
        System.out.println("You are drawing a polygon");

    }

    /**
     * Calculates the area of the polygon.
     * @return area as a double
     */
    @Override
    public double getArea(){
        return 0.0;
    }

    /**
     * Calculates the perimeter.
     * @return the perimeter as a double
     */
    @Override
    public double getPerimeter(){
        double perimeter = numberOfSides * 1.0;
        return perimeter;
    }
}
