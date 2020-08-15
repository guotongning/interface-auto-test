package com.ning.javabase1;

public class Person {
    private String name;
    private int age;
    private boolean gender;
    private double score;
    private double money;
    private Computer computer;
    private Knife knife;
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Knife getKnife() {
        return knife;
    }

    public void setKnife(Knife knife) {
        this.knife = knife;
    }

    private Computer getComputer() {
        return computer;
    }

    private void setComputer(Computer computer) {
        this.computer = computer;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Computer buyComputer(double money) {
        Computer computer = new Computer();
        computer.setComputerType("macbook pro");
        computer.setPrice(8000);
        computer.setCpuType("i7-9700");
        computer.setMemorySize(8 * 1024 * 1024);
        computer.setDeskSize(512 * 1024 * 1024);
        double lastMoney = money - computer.getPrice();
        this.money = lastMoney;
        this.computer = computer;
        return computer;
    }

    public Knife buyKnife(double money) {
        Knife knife = new Knife();
        knife.setDaxiao("通天刀");
        knife.setPrice(20);
        double lastMoney = money - knife.getPrice();
        this.money = lastMoney;
        this.knife = knife;
        return knife;
    }

    public String catComputer(Knife knife) {
        String cat = knife.cat(computer);
        return cat;
    }

    public Car buyCar(double money) {
        Car car = new Car();
        car.setCarPice(80000);
        car.setCarType("大众");
        double lastMoney = money - car.getCarPice();
        this.money = lastMoney;
        this.car = car;
        return car;
    }

    public String addOil(Car car, Oil oil) {
        String add = car.add(oil);
        return add;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", score=" + score +
                ", money=" + money +
                ", computer=" + computer +
                ", knife=" + knife +
                ", car=" + car +
                '}';
    }
}
