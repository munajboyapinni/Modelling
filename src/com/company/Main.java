package com.company;

public class Main {

    public static void main(String[] args) {
        Person person= new Person("Naj",19,"kum41");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getAddress());

        Child child = new Child("nene",13 ,"wa13");
        System.out.println(child.getName());

    }
}
