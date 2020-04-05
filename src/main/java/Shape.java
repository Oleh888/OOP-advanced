public abstract class Shape {
    String name;
    double length;
    String color;

    public Shape(String name, String color, double length) {
        this.name = name;
        this.color = color;
        this.length = length;
    }

    public abstract double getSquare();

    public abstract void draw();

    public String getColor() {
        return color;
    }

    public abstract String showInfo();
}
