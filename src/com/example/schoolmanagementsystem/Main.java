package com.example.schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher asad = new Teacher(1, "Asad", 45000);
        Teacher awais = new Teacher(2, "Awais", 55000);
        Teacher shahroz = new Teacher(3, "Shahroz", 50000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(asad);
        teacherList.add(awais);
        teacherList.add(shahroz);

        Student bilal = new Student(1, "Bilal", 5);
        Student ali = new Student(2, "Ali", 6);
        Student aslam = new Student(3, "Aslam", 7);

        List<Student> studentList = new ArrayList<>();
        studentList.add(bilal);
        studentList.add(ali);
        studentList.add(aslam);

        School msb = new School(teacherList,studentList);

        // Adding new Teacher
        //Teacher atif = new Teacher(6,"Atif", 60000);
        //msb.addTeacher(atif);


        bilal.payFees(50000);
        //System.out.println("MSB has earned Rs "+ msb.getTotalMoneyEarned());
        aslam.payFees(60000);
        System.out.println("MSB has earned Rs "+ msb.getTotalMoneyEarned());


        System.out.println(".........Making School PAY SALARY........");

        asad.receivedSalary(asad.getSalary());
        System.out.println("MSB has spent for salary to " + asad.getName()
        +" and now has Rs " + msb.getTotalMoneyEarned());

        awais.receivedSalary(asad.getSalary());
        System.out.println("MSB has spent for salary to " + awais.getName()
                +" and now has Rs " + msb.getTotalMoneyEarned());

        System.out.println(bilal);

        shahroz.receivedSalary(shahroz.getSalary());

        System.out.println(shahroz);
    }

}
