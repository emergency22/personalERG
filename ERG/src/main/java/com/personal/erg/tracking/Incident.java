package com.personal.erg.tracking;

import com.personal.erg.models.Material;

import java.time.ZonedDateTime;
import java.util.List;

public class Incident {

    private ZonedDateTime incidentDateAndTime;
    private String incidentType;
    private String locationLatitude;
    private String locationLongitude;

    private List<Material> hazardousMaterials;

    public Incident() {
    }

    public Incident(ZonedDateTime incidentDateAndTime, String incidentType, String locationLatitude, String locationLongitude, List<Material> hazardousMaterials) {
        this.incidentDateAndTime = incidentDateAndTime;
        this.incidentType = incidentType;
        this.locationLatitude = locationLatitude;
        this.locationLongitude = locationLongitude;
        this.hazardousMaterials = hazardousMaterials;
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

    public List<Material> getHazardousMaterials() {
        return hazardousMaterials;
    }

    public void setHazardousMaterials(List<Material> hazardousMaterials) {
        this.hazardousMaterials = hazardousMaterials;
    }
}
