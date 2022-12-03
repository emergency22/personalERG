package com.personal.erg.models;

public class Material {

    private String materialName;
    private int unId;
    private int guideNumber;
    private boolean toxicInhalationHazard;
    private boolean waterReactive;
    private boolean chemicalWarfare;

    public Material() {
    }

    public Material(String materialName, int unId, int guideNumber, boolean toxicInhalationHazard, boolean waterReactive, boolean chemicalWarfare ) {
        this.materialName = materialName;
        this.unId = unId;
        this.guideNumber = guideNumber;
        this.toxicInhalationHazard = toxicInhalationHazard;
        this.waterReactive = waterReactive;
        this.chemicalWarfare = chemicalWarfare;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public int getUnId() {
        return unId;
    }

    public void setUnId(int unId) {
        this.unId = unId;
    }

    public int getGuideNumber() {
        return guideNumber;
    }

    public void setGuideNumber(int guideNumber) {
        this.guideNumber = guideNumber;
    }

    public boolean isToxicInhalationHazard() {
        return toxicInhalationHazard;
    }

    public void setToxicInhalationHazard(boolean toxicInhalationHazard) {
        this.toxicInhalationHazard = toxicInhalationHazard;
    }

    public boolean isWaterReactive() {
        return waterReactive;
    }

    public void setWaterReactive(boolean waterReactive) {
        this.waterReactive = waterReactive;
    }

    public boolean isChemicalWarfare() {
        return chemicalWarfare;
    }

    public void setChemicalWarfare(boolean chemicalWarfare) {
        this.chemicalWarfare = chemicalWarfare;
    }
}
