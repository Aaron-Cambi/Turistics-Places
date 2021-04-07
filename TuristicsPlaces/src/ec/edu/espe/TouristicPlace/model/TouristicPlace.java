/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TouristicPlace.model;

/**
 *
 * @author BIOSTAR
 */
public class TouristicPlace {

    private String Name;
    private String type;
    private float latitude;
    private float longitude;
    private float LatitudeStart;
    private float LongitudeStart;
    private float distance;

    public TouristicPlace(String name, String type, float longitude, float latitude, float LongitudeStart, float LatitudeStart, float distance) {
        this.LatitudeStart = LatitudeStart;
        this.LongitudeStart = LongitudeStart;
        this.latitude = latitude;
        this.type = type;
        this.Name = name;
        this.distance = distance;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the latitude
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the LatitudeStart
     */
    
    public float getLatitudeStart() {
        return LatitudeStart;
    }

    /**
     * @param LatitudeStart the LatitudeStar to set
     */
    public void setLatitudeStart(float LatitudeStar) {
        this.LatitudeStart = LatitudeStar;
    }

    /**
     * @return the LongitudeStar
     */
    public float getLongitudeStart() {
        return LongitudeStart;
    }

    /**
     * @param LongitudeStart the LongitudeStar to set
     */
    public void setLongitudeStar(float LongitudeStar) {
        this.LongitudeStart = LongitudeStar;
    }
    
    /**
     * @return the distance
     */
    public float getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(float distance) {
        this.distance = distance;
    }

}
