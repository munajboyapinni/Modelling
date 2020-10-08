package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void getAge() {

         Person p = new Person("S",7,"K");
         assertEquals(p.getAge(),9);
    }

}