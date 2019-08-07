package com.carcharging.carcharging.controller.request;

public class ChargingSectionRequest {
    private String stationId;

    public ChargingSectionRequest() {
    }

    public ChargingSectionRequest(String stationId) {
        this.stationId = stationId;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }
}
