package com.dp.project;

import java.util.ArrayList;

public class CS implements iDepartment{


    ArrayList<String> courseOutlineCS = new ArrayList<String>(5);
    public CS(){

        courseOutlineCS.add("Design Pattern");
        courseOutlineCS.add("Pakistan Studies");
        courseOutlineCS.add("Data Structure");
        courseOutlineCS.add("OOP");
        courseOutlineCS.add("Programming Fundamental");
        courseOutlineCS.add("DBMS");
    }

    @Override
    public ArrayList<String> getCourseOutline() {
        return courseOutlineCS;
    }
}