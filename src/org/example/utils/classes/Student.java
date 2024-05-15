package org.example.utils.classes;

import java.util.Objects;

public class Student {
    private int id;
    private double gpa;
    private char gender;
    private String name;

    public Student(char gender, String name) {
        this(0, 0, gender, name);
    }

    public Student(double gpa, char gender, String name) {
        this(0, gpa, gender, name);
    }

    public Student(int id, double gpa, char gender, String name) {
        this.id = id;
        this.gpa = gpa;
        this.gender = gender;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gpa, gender, name);
    }
}


