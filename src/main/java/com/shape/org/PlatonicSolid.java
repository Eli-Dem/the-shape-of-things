package com.shape.org;

public abstract class PlatonicSolid implements ThreeDimensionalShape {

    abstract double getEdgeLength();
    abstract String getShapeName();


    //since all 5 platonic solids can be described using only the length of a single edge, the toString for all
    //platonic solids will be the same, to take care of the shape name all subclasses will need to implement
    //getShapeName, and name the shape there
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(getShapeName() + " {");
        sb.append("edge length=").append(getEdgeLength());
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
