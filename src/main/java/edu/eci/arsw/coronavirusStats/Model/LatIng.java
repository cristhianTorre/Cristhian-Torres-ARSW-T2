package edu.eci.arsw.coronavirusStats.Model;

public class LatIng {
    private double ing;
    private double lat;

    public LatIng(){

    }

    public LatIng(double ing, double lat) {
        this.ing = ing;
        this.lat = lat;
    }

    public double getIng() {
        return ing;
    }

    public void setIng(double ing) {
        this.ing = ing;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
