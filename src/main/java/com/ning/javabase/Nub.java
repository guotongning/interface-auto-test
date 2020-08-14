package com.ning.javabase;

public class Nub {
    public String number;
    public static int zero;
    public Nub(){

    }
    public Nub(String number){
        this.number=number;
    }
    public static void main(String[] args) {
        Nub nub = new Nub();
        Nub nub1 = new Nub("123");
        System.out.println(nub.number);
        System.out.println(nub1.number);
        System.out.println(Nub.zero);
    }
}
