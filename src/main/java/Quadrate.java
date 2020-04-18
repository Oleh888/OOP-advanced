import java.text.DecimalFormat;

public class Quadrate extends Shape {
    private double length;

    public Quadrate(String name, Colors color, double length) {
        super(name, color);
        this.length = length;
    }

    @Override
    public double getSquare() {
        return length * length;
    }

    @Override
    public void draw() {
        System.out.println("Малюю квадрат");
    }

    @Override
    public String showInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Фігура: ").append(super.getName()).append(", площа: ")
                .append(new DecimalFormat("#0.00").format(getSquare()))
                .append(" кв. од., довжина сторони: ").append(length)
                .append(" од., колір: ").append(super.getColor());
        return info.toString();
    }
}
