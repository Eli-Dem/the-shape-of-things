package com.shape.org;

public class Cylinder extends Shape{

    //properties height and radius, as well as getters and setters for both

    private double height;
    private double radius;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //constructors

    //default sets the size of the shape to 0.0
    public Cylinder(){
        height = 0.0;
        radius = 0.0;
    }

    //this constructor creates the shape and changes its size at the same time.
    public Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }

    //the equations to find the surface area and volume of a cylinder
    @Override
    public double surfaceArea() {
        return (2.0 * Math.PI * radius * (height + radius));
    }

    @Override
    public double volume() {
        return (Math.PI * Math.pow(radius, 2) * height);
    }

    //the toString is overriding the one from Shape to
    //return the name of the shape, height, radius, surface area, and volume.
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cylinder {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
