package pl.waw.sgh.Homework5;

import static java.lang.Math.sqrt;

public class EquilateralTriangle extends AbstractTriangle {

    public EquilateralTriangle(double sideA) {
        super(sideA);
    }

    @Override
    public double calcSurface() {
        return sideA * sideA * sqrt(3) / 4;
    }

}