package com.company;

public class Employee extends Role {
    private int id;
    private double salary;

    public Employee(String name, int age, String pol, int id, double salary) {
        super(name, age, pol);
        this.id = id;
        this.salary = salary;
    }

    @Override
    public void play() {
    }

    public void Output() {
        System.out.println("Имя сотрудника:" + getName());
        System.out.println("Возраст сотрудника:" + getAge());
        System.out.println("Пол сотрудника:" + getPol());
        System.out.println("Идентификатор сотрудника:" + getId());
        System.out.println("Зарплата сотрудника:" + getSalary());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
