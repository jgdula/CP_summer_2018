package pl.waw.sgh.Homework5;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class IsoscelesTriangle extends AbstractTriangle {

    /**
     * @param sideA - the base
     * @param sideB - two arm of triangle
     */
    public IsoscelesTriangle(double sideA, double sideB) {
        super(sideA, sideB);
    }

    @Override
    public double calcSurface() {
        double height = sqrt(pow(sideB, 2d) - pow(sideA / 2, 2d));
        return sideA * height / 2;
    }

}