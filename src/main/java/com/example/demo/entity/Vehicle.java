package com.example.demo.entity;

public class Vehicle {
    private long id;
    private User user;
    private String vehicleNumber;
    private Double capacityKg;
    private Double fuelEfficiency;

    public Vehicle(){}

    public Vehicle(User user, String vehicleNumber, Double capacityKg, Double fuelEfficiency) {
        this.user = user;
        this.vehicleNumber = vehicleNumber;
        this.capacityKg = capacityKg;
        this.fuelEfficiency = fuelEfficiency;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Double getCapacityKg() {
        return capacityKg;
    }

    public void setCapacityKg(Double capacityKg) {
        this.capacityKg = capacityKg;
    }

    public Double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(Double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

}
