package factory_design_pattern;

import factory_design_pattern.interfaces.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square drawing method publish!");
    }
}
