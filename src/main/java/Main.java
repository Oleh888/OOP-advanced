import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<>();
        list.add(ShapeFactory.getShape("коло"));
        list.add(ShapeFactory.getShape("трапеція"));
        list.add(ShapeFactory.getShape("трикутник"));
        list.add(ShapeFactory.getShape("Квадрат"));

        for (Shape shape : list) {
            System.out.println(shape.showInfo());
        }
    }

}
