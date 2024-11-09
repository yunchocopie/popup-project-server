package com.example.popupprojectserver.dto;


public class LocationRequest {
    private double userLatitude;
    private double userLongitude;

    // 기본 생성자, getter 및 setter 추가
    public LocationRequest() {}

    public double getUserLatitude() {
        return userLatitude;
    }

    public void setUserLatitude(double userLatitude) {
        this.userLatitude = userLatitude;
    }

    public double getUserLongitude() {
        return userLongitude;
    }

    public void setUserLongitude(double userLongitude) {
        this.userLongitude = userLongitude;
    }
}
