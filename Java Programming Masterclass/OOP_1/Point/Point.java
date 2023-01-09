/*
Point

You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance
variables) with name x and y of type int.

The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor).
The second constructor has parameters x and y of type int and it needs to initialize the fields.

Write the following methods (instance methods):
* Method named getX without any parameters, it needs to return the value of x field.
* Method named getY without any parameters, it needs to return the value of y field.
* Method named setX with one parameter of type int, it needs to set the value of the x field.
* Method named setY with one parameter of type int, it needs to set the value of the y field.
* Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as
  double.
* Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point
  and Point x,y as double.
* Method named distance with parameter another of type Point, it needs to return the distance between this Point and
  another Point as double.
 */

public class Point {

    private int x;
    private int y;

    public Point() {
        ;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(Point point) {
        return Math.sqrt((this.x - point.getX()) * (this.x - point.getX()) +
                         (this.y - point.getY()) * (this.y - point.getY()));
    }
}
