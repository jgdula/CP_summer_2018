package pl.waw.sgh.Homework5;

public class Homework5 {

    /**Please create new shapes based on the pl.waw.sgh.shapes.Shape class.
     1. Create an abstract AbstractTriangle class
     2. Create classes that extend the AbstractTriangle:
     - Equilateral Triangle
     - Isosceles Triangle
     - Scalene Triangle
     (https://www.mathsisfun.com/triangle.html)
     3. Add implementation of calcSurface for all triangles.
     Note, you can put the common part of the implementation in the AbstractTriangle.
     */

    public Homework5(){
        System.out.printf("Homework5:\n");
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);
        System.out.printf(equilateralTriangle.toString());

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(5, 8);
        System.out.printf(isoscelesTriangle.toString());

        ScaleneTriangle scaleneTriangle = new ScaleneTriangle(8, 10, 12);
        System.out.printf(scaleneTriangle.toString());
    }
}
