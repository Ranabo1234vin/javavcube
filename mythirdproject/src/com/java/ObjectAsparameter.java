package com.java;
class Student {
    String name;
    int age;
}

public class ObjectAsparameter {

    // Method that takes Student object
    void printDetails(Student s) {
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
    }

    public static void main(String[] args) {
    	ObjectAsparameter obj = new ObjectAsparameter();

        // Creating Student object
        Student st = new Student();
        st.name = "Rahul";
        st.age = 20;

        // Passing object to method
        obj.printDetails(st);
    }
}