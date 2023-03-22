package com.company;
public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Мария", 18, "женский", 123456,1025.5);
        employee.Output();
        employee.sing();
        Manager manager = new Manager("Александр", 23,"мужской", 987654, 100000, "");
        manager.Output();
        manager.play();
    }
}
