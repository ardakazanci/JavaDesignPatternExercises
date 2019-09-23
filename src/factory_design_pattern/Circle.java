package factory_design_pattern;

import factory_design_pattern.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle drawing method publish!");
    }
}
