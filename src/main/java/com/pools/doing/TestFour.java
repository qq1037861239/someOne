package com.pools.doing;

import com.pools.pojo.Plane;
import com.pools.pojo.Trees;

import java.util.*;

//The question is :

/**
 * How do you cast a List of supertypes to a List of subtypes?
 *
 * For example, lets say you have two classes:
 * public class TestA {}
 * public class TestB extends TestA{}
 *
 * I have a method that returns a List<TestA> and I would like to
 * cast all the objects in that list to TestB so that I end up with
 * a List<TestB>.
 */

public class TestFour {

    public static void main(String[] args) {
        List<Plane> lipl = new ArrayList<>();

        //One way
//        List<?> lite = (List<Plane>) lipl;
//        List<Trees> litr = (List<Trees>) lite;

        //The same kind to One
        List<Trees> litr = (List<Trees>) (List<?>) lipl;

        List<Trees> litree = new ArrayList<>();
        List<Plane> liplane = new ArrayList<>();

        litree.addAll(liplane);
    }
}
