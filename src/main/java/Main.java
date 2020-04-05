import java.util.Random;

public class Main {
    static String[] colors = {"червоний", "блакитний", "білий", "зелений", "чорний", "жовтий"};

    public static void main(String[] args) {
        Shape[] shapes = new Shape[new Random().nextInt(6) + 1];
        for (int i = 0; i < shapes.length; i++) {
            Shape[] realShapes = {
                    new Quadrate("Квадрат", colors[new Random().nextInt(6)],
                            new Random().nextInt(25) + 1),
                    new Circle("Коло", colors[new Random().nextInt(6)],
                            new Random().nextInt(25) + 1),
                    new Trapeze("Трапеція",
                            colors[new Random().nextInt(6)], new Random().nextInt(25) + 1,
                            new Random().nextInt(25) + 1, new Random().nextInt(25) + 1),
                    new Triangle("Трикутник",
                            colors[new Random().nextInt(6)], new Random().nextInt(25) + 1,
                            new Random().nextInt(25) + 1)};
            shapes[i] = realShapes[new Random().nextInt(4)];
            System.out.println(shapes[i].showInfo());
        }
    }
}
