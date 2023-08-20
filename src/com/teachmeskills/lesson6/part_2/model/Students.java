package com.teachmeskills.lesson6.part_2.model;

import java.util.Objects;

public class Students {

    public String name;
    public String city;
    public String group;
    public long studentId;

    //fields

    public Students(){
        this.name = "Petrov";
        this.city = "Minsk";
        this.group = "1";
        this.studentId = 1234567890;
    }

    public Students(String name, String address, String group, long studentId){
        this.name = name;
        this.city = address;
        this.group = group;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", address='" + city + '\'' +
                ", group='" + group + '\'' +
                ", studentId=" + studentId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students students)) return false;
        return studentId == students.studentId && Objects.equals(name, students.name) && Objects.equals(city, students.city) && Objects.equals(group, students.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, group, studentId);
    }
}
