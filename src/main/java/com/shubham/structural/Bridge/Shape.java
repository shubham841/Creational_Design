package com.shubham.structural.Bridge;

public abstract class Shape {
    protected Renderer renderer;
    // Constructor to accept a renderer
    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }
    public abstract void draw();
}
