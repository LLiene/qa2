package Weather.model;

public class Coord {

    private Double lon;
    private Double lat;

    //katram objektam vajag geter un setter, CODE -> GENERATE


    public void setLon(Double lon) {
        this.lon = lon;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLon() {
        return lon;
    }
}
