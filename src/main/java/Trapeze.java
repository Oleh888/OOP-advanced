import java.text.DecimalFormat;

public class Trapeze extends Shape {
    private double width;
    private double height;
    private double length;

    public Trapeze(String name, Colors color, double length, double width, double height) {
        super(name, color);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSquare() {
        return height * (length + width) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Малюю трапецію");
    }

    @Override
    public String showInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Фігура: ").append(super.getName()).append(", площа: ")
                .append(new DecimalFormat("#0.00").format(getSquare()))
                .append(" кв. од., довжина однієї сторони: ").append(length)
                .append(" од., довжина іншої сторони:").append(width)
                .append(" од., висота: ").append(height)
                .append(" од., колір: ").append(super.getColor());
        return info.toString();
    }
}
