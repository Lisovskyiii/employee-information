package com.company;
public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Кирилл", 18, "мужской", 123456,1000);
        employee.Output();
        employee.sing();
        Manager manager = new Manager("Егор", 19,"мужской", 987654, 900, "AMG");
        manager.Output();
        manager.play();
    }
}


