package factory_design_pattern;

import factory_design_pattern.factory.ShapeFactory;
import factory_design_pattern.interfaces.Shape;

public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangleShape = shapeFactory.getShape("RECTANGLE");
        Shape circleShape = shapeFactory.getShape("CIRCLE");
        Shape squareShape = shapeFactory.getShape("SQUARE");

        squareShape.draw();
        circleShape.draw();
        rectangleShape.draw();

    }

}
