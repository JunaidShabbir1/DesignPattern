package com.dp.project;

import java.util.HashMap;

public class TeacherC extends Fast{
	
    static TeacherA obj1;
    static TeacherB obj2;
    static TeacherC ta;

    static HashMap<Integer, TeacherC> obj = new HashMap<Integer, TeacherC>();
    private TeacherC()
    {

    }
    public static TeacherC GetTeacherC(int key) {
    	System.out.println("===========MultiTon===========");
        if (!obj.containsKey(key)) {
        	ta = new TeacherC();
        	obj.put(key, ta);
        	System.out.println("Teacher A with key: "+key+" is created, "+ta);
        	return ta;
        }
        System.out.println("already exist");
        return null;
    }
}
