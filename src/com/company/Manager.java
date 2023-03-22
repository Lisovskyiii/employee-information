package com.company;

public class Manager extends Employee {
    final String vehicle;

    public Manager(String name, int age, String pol, int id, double salary, String vehicle) {
        super(name, age, pol, id, salary);
        this.vehicle = vehicle;
    }

    final String getVehicle() {
        return vehicle;
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Марка автомобиля:" + this.getVehicle());
    }

}
