package pl.waw.sgh.Homework5;

import static java.lang.Math.sqrt;

public class ScaleneTriangle extends AbstractTriangle {

    public ScaleneTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public double calcSurface() {
        double s = (sideA + sideB + sideC) / 2;
        return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

}