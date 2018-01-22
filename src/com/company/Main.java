package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person exampleHuman = new Person(39, 5.6, 165, "White", "boy");

        System.out.println(exampleHuman.toString());
        System.out.println(exampleHuman);
    }

    @Override
    public String toString() {
        return "This is a Person Class: " + this.age + " " + this.weight
    }
}
