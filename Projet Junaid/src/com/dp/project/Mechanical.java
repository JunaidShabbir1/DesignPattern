package com.dp.project;

import java.util.ArrayList;

public class Mechanical implements iDepartment{


    ArrayList<String> courseOutlineM = new ArrayList<String>(5);
    public Mechanical(){

        courseOutlineM.add("Design Pattern");
        courseOutlineM.add("Pakistan Studies");
        courseOutlineM.add("Data Structure");
        courseOutlineM.add("OOP");
        courseOutlineM.add("Programming Fundamental");
    }

    @Override
    public ArrayList<String> getCourseOutline() {
        return courseOutlineM;
    }
    
}
