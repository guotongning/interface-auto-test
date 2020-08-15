package com.ning.javabase1;

import org.junit.Test;

public class Main {
    @Test
    public void testCreate(){
        Person person = new Person();
        person.setName("fwl");
        person.setAge(20);
        person.setGender(true);
        person.setScore(59.0);
        person.setMoney(100000);
        Computer computer = person.buyComputer(person.getMoney());
        Knife knife = person.buyKnife(person.getMoney());
        String result = person.catComputer(person.getKnife());
        Car car = person.buyCar(person.getMoney());
        Oil oil = new Oil();
        String addOil = person.addOil(car, oil);
        System.out.println(addOil);
        System.out.println(result);
        System.out.println(knife);
        System.out.println(computer);
        System.out.println(person);
    }
    @Test
    public void testCreate1(){
        //调用Computer类的构造方法，创建了一个Computer类型的computer对象。
        Computer computer = new Computer();
        computer.setComputerType("华硕");
        computer.setCpuType("i5-6700");
        computer.setDeskSize(512*1024*1024);
        computer.setMemorySize(8*1024*1024);
        computer.setPrice(9999.9);
        System.out.println(computer);
    }
}
