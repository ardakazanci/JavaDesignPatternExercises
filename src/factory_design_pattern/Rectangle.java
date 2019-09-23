package factory_design_pattern;

import factory_design_pattern.interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle drawing method publish!");
    }
}
