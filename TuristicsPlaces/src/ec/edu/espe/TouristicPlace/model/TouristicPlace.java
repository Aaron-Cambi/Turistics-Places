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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * @return the LatitudeStar
     */
    public float getLatitudeStar() {
        return LatitudeStar;
    }

    /**
     * @param LatitudeStar the LatitudeStar to set
     */
    public void setLatitudeStar(float LatitudeStar) {
        this.LatitudeStar = LatitudeStar;
    }

    /**
     * @return the LongitudeStar
     */
    public float getLongitudeStar() {
        return LongitudeStar;
    }

    /**
     * @param LongitudeStar the LongitudeStar to set
     */
    public void setLongitudeStar(float LongitudeStar) {
        this.LongitudeStar = LongitudeStar;
    }
    
    private String name;
        private String type;
        private float latitude;
        private float longitude;
        private float distance;
        private float LatitudeStar;
        private float LongitudeStar;
}