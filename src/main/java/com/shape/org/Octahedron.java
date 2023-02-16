package com.shape.org;

public class Octahedron extends PlatonicSolid {

    //property edgeLength as well as the getter and setter for it.
    private double edgeLength;

    @Override
    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    //constructors

    //default constructor returns a shape with size of 0.0
    public Octahedron(){
        edgeLength = 0.0;
    }

    //this constructor creates the shape as well as changing the size of it.
    public Octahedron(double edgeLength){
        this.edgeLength = edgeLength;
    }

    //this is used to name the shape for the toString
    @Override
    String getShapeName() {
        return "Octahedron";
    }

    // equations found under "Area and volume" header https://en.wikipedia.org/wiki/Octahedron
    @Override
    public double surfaceArea() {
        return (2.0 * Math.sqrt(3.0) * Math.pow(edgeLength, 2));
    }

    @Override
    public double volume() {
        return ((1.0/3.0) * Math.sqrt(2.0) * Math.pow(edgeLength, 3));
    }

    //uses to the toString from PlatonicSolid
    @Override
    public String toString() {
        return super.toString();
    }
}
