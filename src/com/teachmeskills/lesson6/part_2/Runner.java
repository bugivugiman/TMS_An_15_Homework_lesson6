package com.teachmeskills.lesson6.part_2;

import com.teachmeskills.lesson6.part_2.model.Students;

import java.sql.SQLOutput;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Start");

        Students student1 = new Students();
        Students student2 = new Students("Ivanov", "Poland", "14", 34156767);
        Students student3 = new Students("Sidorov", "Germany", "21", 6565656);

        System.out.println("List students: ");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println("================================");
        System.out.println("1 and 2");
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode() + "  /  " + student2.hashCode());
        System.out.println("2 and 3");
        System.out.println(student2.equals(student3));
        System.out.println(student2.hashCode() + "  /  " + student3.hashCode());




        System.out.println("End");
    }

}
