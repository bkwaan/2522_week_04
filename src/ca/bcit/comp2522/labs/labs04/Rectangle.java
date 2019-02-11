package ca.bcit.comp2522.labs.labs04;

/**
 * Rectangle.
 * @author Bosco Kwan
 * @version 2019
 */


/**
 * Constructs a rectangle along with providing the area and perimeter.
 */
public class Rectangle extends Shape2D {
    private double width;
    private double height;

    /**
     * Constructs the rectangle
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    /**
     * Draws the shape rectangle.
     */
    @Override
    public void draw(){
        System.out.println("You are drawing the rectangle");
    }

    /**
     * Returns the area of the rectangle.
     * @return area of rectangle as a double
     */
    @Override
    public double getArea(){
        double area = width*height;
        return area;
    }

    /**
     * Returns the perimeter of the rectangle.
     * @return perimeter of rectangle as a double
     */
    @Override
    public double getPerimeter(){
        double perimeter = 2*width + 2*height;
        return perimeter;
    }

}
