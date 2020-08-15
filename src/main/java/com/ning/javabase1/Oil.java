package com.ning.javabase1;

public class Oil {
    private double oilprice;
    private double oilTotal;
    public double getOilprice(){
        return oilprice;
    }
    public void setOilprice(double oilprice){
        this.oilprice=oilprice;
    }
    public double getOilTotal(){
        return oilTotal;
    }
    public void setOilTotal(double oilTotal){
        this.oilTotal=oilTotal;
    }
    public void oilRemaining(){
        setOilTotal(0);
    }

    @Override
    public String toString() {
        return "Oil{" +
                "oilprice=" + oilprice +
                ", oilTotal=" + oilTotal +
                '}';
    }
}
