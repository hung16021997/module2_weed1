package class_oop.phuongtrinhbac2;

public class phuongtrinhbac2 {
    private double a, b, c;

    public void phuongtrinhbac2() {
    }

    public void phuongtrinhbac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDelta() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public String checkRoot() {
        if (this.getDelta() < 0) {
            return "The equation has no roots";
        } else if (this.getDelta() == 0) {
            return "The equation has a root";
        } else {
            return "The equation has 2 roots";
        }
    }

    public double getRoot1() {
        if (this.getDelta() >= 0) {
            return (-this.b + Math.sqrt(getDelta())) / (2 * this.a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (this.getDelta() >= 0) {
            return (-this.b - Math.sqrt(getDelta())) / (2 * this.a);
        } else {
            return 0;
        }
    }
}
