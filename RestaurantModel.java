package com.geekster.Restaurant.model;

public class RestaurantModel {

    private String restaurantName;
    private String address;
    private String number;
    private String speciality;
    private int totalStaff;
    private boolean homeDelivery;

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public boolean isHomeDelivery() {
        return homeDelivery;
    }

    public void setHomeDelivery(boolean homeDelivery) {
        this.homeDelivery = homeDelivery;
    }

    public RestaurantModel() {
    }

    public RestaurantModel(String restaurantName, String address, String number, String speciality, int totalStaff, boolean homeDelievery) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.number = number;
        this.speciality = speciality;
        this.totalStaff = totalStaff;
        this.homeDelivery = homeDelievery;
    }

    @Override
    public String toString() {
        return "Model{" +
                "restaurantName='" + restaurantName + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", speciality='" + speciality + '\'' +
                ", totalStaff=" + totalStaff +
                ", homeDelivery=" + homeDelivery +
                '}';
    }
}
