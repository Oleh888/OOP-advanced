import java.text.DecimalFormat;

public class Trapeze extends Shape {
    private double width;
    private double height;

    public Trapeze(String name, String color, double length, double width, double height) {
        super(name, color, length);
        this.width = width;
        this.height = height;
    }

    public double getSquare() {
        return height * (length + width) / 2;
    }

    public void draw() {
        System.out.println("Малюю трапецію");
    }

    @Override
    public String showInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Фігура: ").append(name).append(", площа: ")
                .append(new DecimalFormat("#0.00").format(getSquare()))
                .append(" кв. од., довжина однієї сторони: ").append(length)
                .append(" од., довжина іншої сторони:").append(width)
                .append(" од., висота: ").append(height)
                .append(" од., колір: ").append(color);
        return info.toString();
    }
}
