package pl.waw.sgh.Homework5;

abstract class AbstractTriangle {
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public AbstractTriangle(double sideA) {
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideA;
    }

    public AbstractTriangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideB;
    }

    public AbstractTriangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    protected abstract double calcSurface();

    @Override
    public String toString() {
            return this.getClass().getSimpleName() + " [ sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + ", surface=" + calcSurface() + " ]\n";
    }
}
