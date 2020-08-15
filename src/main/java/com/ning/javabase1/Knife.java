package com.ning.javabase1;

public class Knife {
    private String daxiao;
    private double price;

    public String getDaxiao() {
        return daxiao;
    }

    public void setDaxiao(String daxiao) {
        this.daxiao = daxiao;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String cat(Computer computer) {
        computer.damage();
        return "电脑已损坏";
    }

    @Override
    public String toString() {
        return "Knife{" +
                "daxiao='" + daxiao + '\'' +
                ", price=" + price +
                '}';
    }
}
