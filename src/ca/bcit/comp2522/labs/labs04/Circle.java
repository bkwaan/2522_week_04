package ca.bcit.comp2522.labs.labs04;

/**
 * Circle.
 * @author Bosco
 * @version 2019
 */

public class Circle extends Shape2D {
    private double radius;
    public static final double PI = 3.141592535;

    /**
     * Creates a circle based on the radius.
     * @param radius of the circle
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * Draws the circle.
     */
    @Override
    void draw(){
        System.out.println("You are drawing the circle");
    }

    /**
     * Returns the area of the circle
     * @return area of the circle as a double.
     */
    @Override
    double getArea(){
        double area = PI*radius;
        Math.pow(area,2);
        return area;
    }

    /**
     * Returns the perimeter of the circle.
     * @return perimeter of circle as a double.
     */
    @Override
    double getPerimeter(){
        return 2*PI*radius;
    }
}
