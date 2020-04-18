public abstract class Shape {
    private String name;
    private Colors color;

    public Shape(String name, Colors color) {
        this.name = name;
        this.color = color;
    }

    public abstract double getSquare();

    public abstract void draw();

    public Colors getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public abstract String showInfo();
}
