package com.ning.javabase1;

public class Car {
    private double carPice;
    private String carType;
    private String oilCapacity;

    public double getCarPice() {
        return carPice;
    }

    public void setCarPice(double carPice) {
        this.carPice = carPice;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getOilCapacity() {
        return oilCapacity;
    }

    public void setOilCapacity(String oilCapacity) {
        this.oilCapacity = oilCapacity;
    }

    public String add(Oil oil) {
        oil.oilRemaining();
        setOilCapacity("满");
        return "油已加满";
    }

    @Override
    public String toString() {
        return "Car{" +
                "carPice='" + carPice + '\'' +
                ", carType='" + carType + '\'' +
                ", oilCapacity='" + oilCapacity + '\'' +
                '}';
    }
}
