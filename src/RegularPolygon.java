import ca.bcit.comp2522.labs.labs04.Polygon;

/**
 * Extended class of polygon.
 * @author Bosco
 * @version 2019
 */
public class RegularPolygon extends Polygon {

    private double lengthOfSides;
    private double apothem;

    /**
     * Creates a regular polygon.
     * @param numberOfSides the number of sides of the polygon.
     * @param lengthOfSides the length of those sides.
     * @param apothem the apothem.
     */
    public RegularPolygon(int numberOfSides,double lengthOfSides,
                          double apothem){
        super();
        this.numberOfSides = numberOfSides;
        this.lengthOfSides = lengthOfSides;
        this.apothem = apothem;
    }

    @Override
    public void draw(){
        System.out.println("Drawing polygon");
    }
    /**
     * Returns the perimeter of the polygon.
     * @return the perimeter of the polygon
     */
    @Override
    public double getPerimeter(){
        double regularPerimeter = lengthOfSides * numberOfSides;
        return regularPerimeter;
    }

    /**
     * Returns the area of the polygon.
     * @return the area of the polygon
     */
    @Override
    public double getArea(){
       double regularArea = 0.5 * apothem;
       return regularArea;
    }

}
