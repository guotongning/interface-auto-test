package com.ning.javabase;

public class A {
    public String a;
    public static int zoo;
    public A(){

    }
    public A(String a){
        this.a=a;
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.zoo);
        System.out.println(a);
    }

    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                '}';
    }
}
