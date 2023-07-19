package ru.homework;

import java.util.Objects;

public class Cat {
    private String name;
    private String color;
    private int weight;
    private int age;

    public Cat(String name, String color, int weight, int age) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    @Override
    public String toString() {
        return String.format("%s, %s, %d, %d\n", name, color, weight, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight && age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, weight, age);
    }
}
