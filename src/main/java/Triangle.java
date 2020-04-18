import java.text.DecimalFormat;

public class Triangle extends Shape {
    private double cathetus1;
    private double cathetus2;

    public Triangle(String name, Colors color, double cathetus1, double cathetus2) {
        super(name, color);
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
    }

    @Override
    public double getSquare() {
        return cathetus1 * cathetus2 / 2;
    }

    double getHypotenuse() {
        return Math.sqrt((cathetus1 * cathetus1 + cathetus2 * cathetus2));
    }

    @Override
    public void draw() {
        System.out.println("Малюю трикутник");
    }

    @Override
    public String showInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Фігура: ").append(super.getName()).append(", площа: ")
                .append(new DecimalFormat("#0.00").format(getSquare()))
                .append(" кв. од., довжина одного катета: ").append(cathetus1)
                .append(" од., довжина іншого катета: ").append(cathetus2)
                .append(" од., довжина гіпотенузи: ")
                .append(new DecimalFormat("#0.00").format(getHypotenuse()))
                .append(" од., колір: ").append(getColor());
        return info.toString();
    }
}
