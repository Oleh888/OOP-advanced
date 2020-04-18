import java.util.Random;

public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("трапеція")) {
            return new Trapeze("Трапеція",
                    Colors.values()[new Random().nextInt(Colors.values().length)],
                    new Random().nextInt(25) + 1,
                    new Random().nextInt(25) + 1, new Random().nextInt(25) + 1);
        }
        if (shapeType.equalsIgnoreCase("трикутник")) {
            return new Triangle("Трикутник",
                    Colors.values()[new Random().nextInt(Colors.values().length)],
                    new Random().nextInt(25) + 1,
                    new Random().nextInt(25) + 1);
        }
        if (shapeType.equalsIgnoreCase("коло")) {
            return new Circle("Коло",
                    Colors.values()[new Random().nextInt(Colors.values().length)],
                    new Random().nextInt(25) + 1);
        }
        if (shapeType.equalsIgnoreCase("квадрат")) {
            return new Quadrate("Квадрат",
                    Colors.values()[new Random().nextInt(Colors.values().length)],
                    new Random().nextInt(25) + 1);
        }
        return null;
    }
}
