package class_oop.classfan;

class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan() {
    }
    public Fan(int speed,boolean on,double radius,String color) {
        this.speed = speed;
        this.on = false;
        this.radius = radius;
        this.color = color;
    }
    public int getSpeed() {
        return this.speed;
    }
    public String getOn() {
        if (!this.on) {
            return "This is Off";
        } else {
            return "This is On";
        }
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
}