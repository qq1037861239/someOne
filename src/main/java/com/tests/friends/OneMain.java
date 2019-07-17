package com.tests.friends;

import com.tests.friends.impls.SportsIntfImpl;

public class OneMain {

    public static void main(String[] args) {
        SportsIntfImpl spo = new SportsIntfImpl();
        System.out.println(spo.NAME);

        //这个是不是多态？
        //Is this polymorphism?
        SportsIntf spor = new SportsIntfImpl();
        System.out.println(spor.AGE);
    }
}
