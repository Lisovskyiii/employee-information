package com.company;

public abstract class Role {
    private String name;
    private int age;
    private String pol;

    public Role(String name, int age, String pol) {
        this.name = name;
        this.age = age;
        this.pol = pol;
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

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public abstract void Output();

    public abstract void play();

    public void sing() {
        System.out.println("\nработает метод sing\n");
    }
}
