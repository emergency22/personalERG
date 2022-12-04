package com.personal.erg.tracking;

import java.time.ZonedDateTime;

public class Incident {

    private ZonedDateTime incidentDateAndTime;
    private String incidentType;
    private String locationLatitude;
    private String locationLongitude;

    public Incident() {
    }

    public Incident(ZonedDateTime incidentDateAndTime, String incidentType, String locationLatitude, String locationLongitude) {
        this.incidentDateAndTime = incidentDateAndTime;
        this.incidentType = incidentType;
        this.locationLatitude = locationLatitude;
        this.locationLongitude = locationLongitude;
    }

    public ZonedDateTime getIncidentDateAndTime() {
        return incidentDateAndTime;
    }

    public void setIncidentDateAndTime(ZonedDateTime incidentDateAndTime) {
        this.incidentDateAndTime = incidentDateAndTime;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getLocationLatitude() {
        return locationLatitude;
    }

    public void setLocationLatitude(String locationLatitude) {
        this.locationLatitude = locationLatitude;
    }

    public String getLocationLongitude() {
        return locationLongitude;
    }

    public void setLocationLongitude(String locationLongitude) {
        this.locationLongitude = locationLongitude;
    }
}
