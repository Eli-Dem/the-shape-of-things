package com.shape.org;

public class Cone extends Shape{

    //radius and height field as well as their getter and setter
    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //constructors

    //the default one sets the shapes size to 0.0
    public Cone() {
        this.radius = 0.0;
        this.height = 0.0;
    }

    //this constructor creates the shape while setting its size at the same time
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    //equations found on https://en.wikipedia.org/wiki/Cone under the Measurements and equations header
    public double surfaceArea() {
        return (Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2) ) ));
    }

    public double volume() {
        return (Math.PI * Math.pow(radius, 2) * height) / 3.0;
    }

    //overriding the toString to show the shapes name
    //radius, surface area, and volume.
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone {");
        sb.append("radius=").append(radius);
        sb.append(", height= ").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
