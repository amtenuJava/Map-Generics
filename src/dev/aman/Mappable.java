package dev.aman;

import java.util.Arrays;

public interface Mappable {

    void render();

    static double[] stringToLatLon(String location){
        var splits=location.split(",");
        double lat=Double.valueOf(splits[0]);
        double lgn=Double.valueOf(splits[1]);

        return new double[] {lat,lgn};
            }
}

abstract class Point implements Mappable{
    private double[] location=new double[2];

    public Point( String location){
        this.location=Mappable.stringToLatLon(location);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + "as point (" + location() + ")");
    }

    private String location(){
        return Arrays.toString(location);
    }
}

abstract  class Line implements Mappable{
    private double[][] locations;


    public Line(String...locations){
       this.locations=new double[locations.length][] ;
       int index=0;

        for (var loc:locations
             ) {
            this.locations[index++]=Mappable.stringToLatLon(loc);
        }
    }

    @Override
    public void render() {
        System.out.println("Render " + this + "as line (" + location() + ")");
    }

    private String location(){
        return Arrays.deepToString(locations);
    }

}
