package com.java;

class Student123 {
    String name;
    int age;
}

public class Main {

    // Method that takes Student object
        void printDetails(Student123 st) {
        	System.out.println(st);
        System.out.println("Name: " + st.name);
        System.out.println("Age: " + st.age);
    }

    public static void main(String[] args) {
        Main obj = new Main();

        // Creating Student object
        Student123 st = new Student123();
        st.name = "Rahul";
        st.age = 20;  
        Student123 obj1=new Student123();
        obj1.name="vinay";
        obj1.age=25;

        // Passing object to method
        obj.printDetails(st);
        System.out.println(st);
        obj.printDetails(obj1);
    }
}
