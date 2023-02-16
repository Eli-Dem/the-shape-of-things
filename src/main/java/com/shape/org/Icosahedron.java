package com.shape.org;

public class Icosahedron extends PlatonicSolid {

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

    // the default constructor returns 0.0, making property of the shape 0.0
    public Icosahedron(){
        edgeLength = 0.0;
    }

    //this constructor sets the edge length while making the shape
    public Icosahedron(double edgeLength){
        this.edgeLength = edgeLength;
    }

    //this is where the shape is named for toString, because I am using the toString from
    //PlatonicSolid instead of one here where I would type the name.
    @Override
    String getShapeName() {
        return "Icosahedron";
    }

    //equations found under "Area and volume" header https://en.wikipedia.org/wiki/Regular_icosahedron
    @Override
    public double surfaceArea() {
        return (5.0 * Math.sqrt(3.0) * Math.pow(edgeLength, 2));
    }

    @Override
    public double volume() {
        return ((5.0/12.0) * (3.0 + Math.sqrt(5.0)) * Math.pow(edgeLength, 3));
    }

    //calls the toString from PlatonicSolid
    @Override
    public String toString() {
       return super.toString();
    }
}
