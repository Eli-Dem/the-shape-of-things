package com.shape.org;

public class Sphere extends Shape{

    //radius property as well as its getter and setter
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //constructors

    //the default one sets the shapes size to 0.0
    public Sphere() {
        super();
        this.radius = 0.0;
    }

    //this constructor creates the shape while setting its size at the same time
    public Sphere(double v) {
        super();
        this.radius = v;
    }

    //equations provided
    public double surfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    //overriding the toString to show the shapes name
    //radius, surface area, and volume.
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sphere {");
        sb.append("radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
