package com.ning.javabase1;

public class Computer {
    private String computerType;
    private String cpuType;
    private int memorySize;
    private int deskSize;
    private double price;
    public String getComputerType(){
        return computerType;
    }
    public void setComputerType(String computerType){
        this.computerType=computerType;
    }
    public String getCpuType(){
        return cpuType;
    }
    public void setCpuType(String cpuType){
        this.cpuType=cpuType;
    }
    public int getMemorySize(){
        return memorySize;
    }
    public void setMemorySize(int memorySize){
        this.memorySize=memorySize;
    }
    public int getDeskSize(){
        return deskSize;
    }
    public void  setDeskSize(int deskSize){
        this.deskSize=deskSize;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void damage(){
        setPrice(0.0);
        setDeskSize(0);
        setMemorySize(0);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerType='" + computerType + '\'' +
                ", cpuType='" + cpuType + '\'' +
                ", memorySize=" + memorySize +
                ", deskSize=" + deskSize +
                ", price=" + price +
                '}';
    }
}
