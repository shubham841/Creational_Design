package com.shubham.structural.Bridge;

public class RasterRenderer implements Renderer{
    @Override
    public void renderCircle(double radius) {
        System.out.println("Raster Rendering: Drawing Circle with radius " + radius);
    }
    @Override
    public void renderRectangle(double width, double height) {
        System.out.println("Raster Rendering: Drawing Rectangle with width " + width + " and height " + height);
    }
}
