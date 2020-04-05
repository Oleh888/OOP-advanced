import java.text.DecimalFormat;

public class Quadrate extends Shape {

    public Quadrate(String name, String color, double length) {
        super(name, color, length);
    }

    public double getSquare() {
        return length * length;
    }

    public void draw() {
        System.out.println("Малюю квадрат");
    }

    @Override
    public String showInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Фігура: ").append(name).append(", площа: ")
                .append(new DecimalFormat("#0.00").format(getSquare()))
                .append(" кв. од., довжина сторони: ").append(length)
                .append(" од., колір: ").append(color);
        return info.toString();
    }
}
