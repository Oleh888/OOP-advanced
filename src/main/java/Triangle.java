import java.text.DecimalFormat;

public class Triangle extends Shape {
    private double cathetus2;

    public Triangle(String name, String color, double cathetus1, double cathetus2) {
        super(name, color, cathetus1);
        this.cathetus2 = cathetus2;
    }

    public double getSquare() {
        return length * cathetus2 / 2;
    }

    double getHypotenuse() {
        return Math.sqrt((length * length + cathetus2 * cathetus2));
    }

    public void draw() {
        System.out.println("Малюю трикутник");
    }

    @Override
    public String showInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Фігура: ").append(name).append(", площа: ")
                .append(new DecimalFormat("#0.00").format(getSquare()))
                .append(" кв. од., довжина одного катета: ").append(length)
                .append(" од., довжина іншого катета: ").append(cathetus2)
                .append(" од., довжина гіпотенузи: ")
                .append(new DecimalFormat("#0.00").format(getHypotenuse()))
                .append(" од., колір: ").append(color);
        return info.toString();
    }
}
