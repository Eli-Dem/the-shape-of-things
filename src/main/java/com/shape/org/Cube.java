package com.shape.org;

public class Cube extends PlatonicSolid {

    //edgeLength property as well as it's getter and setter
    private double edgeLength;

    @Override
    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    //constructors

    //the default sets the shapes size to 0.0
    public Cube(){
        edgeLength = 0.0;
    }

    //this constructor creates the shape and changes its size at the same time.
    public Cube(double edgeLength){
        this.edgeLength = edgeLength;
    }

    //this is where the shape is named for the toString
    @Override
    String getShapeName() {
        return "Cube";
    }

    //equations to find the surface area and volume of the cube
    @Override
    public double surfaceArea() {
        return (6.0 * Math.pow(edgeLength, 2));
    }

    @Override
    public double volume() {
        return Math.pow(edgeLength, 3);
    }

    //uses the toString from PlatonicSolid
    @Override
    public String toString() {
        return super.toString();
    }
}
