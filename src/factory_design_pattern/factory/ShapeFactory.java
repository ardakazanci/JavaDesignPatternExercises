package factory_design_pattern.factory;

import factory_design_pattern.Circle;
import factory_design_pattern.Rectangle;
import factory_design_pattern.Square;
import factory_design_pattern.interfaces.Shape;


/**
 * Factory Method
 * İlgili şekil nesnesini üretmektedir.
 * Aldığı string kontrolünden geçerek ilgili nesne üretilmektedir.
 * Geriye Shape interface i döndürmektedir.
 * Shape interface i ilgili şekil sınıflarında implement edildiği için polymorphic yapı sergilenmektedir.
 */
public class ShapeFactory {

    public Shape getShape(String shapeName) {

        if (shapeName == null) {
            return null;
        } else if (shapeName.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeName.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;

    }

}
