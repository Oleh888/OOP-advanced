import java.text.DecimalFormat;

public class Circle extends Shape {
    public Circle(String name, String color, double radius) {
        super(name, color, radius);
    }

    public double getSquare() {
        return Math.PI * length * length;
    }

    public void draw() {
        System.out.println("Малюю коло");
    }

    public double getCircleLength() {
        return 2 * Math.PI * length;
    }

    @Override
    public String showInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Фігура: ").append(name).append(", площа: ")
                .append(new DecimalFormat("#0.00").format(getSquare()))
                .append(" кв. од., довжина радіусу: ").append(length)
                .append(" од., колір: ").append(color);
        return info.toString();
    }
}
