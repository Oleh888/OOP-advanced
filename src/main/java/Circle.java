import java.text.DecimalFormat;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, Colors color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Малюю коло");
    }

    public double getCircleLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String showInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Фігура: ").append(super.getName()).append(", площа: ")
                .append(new DecimalFormat("#0.00").format(getSquare()))
                .append(" кв. од., довжина радіусу: ").append(super.getName())
                .append(" од., колір: ").append(super.getColor());
        return info.toString();
    }
}
