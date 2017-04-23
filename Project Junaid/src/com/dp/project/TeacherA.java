package com.dp.project;

import java.util.HashMap;

public class TeacherA extends KU {
	static TeacherA ta = null;
    static TeacherB obj1;
    static TeacherC obj2;

    static HashMap<Integer, TeacherA> obj = new HashMap<Integer, TeacherA>();

    private TeacherA() {
    		
    }

    public static TeacherA GetTeacherA(int key) {
    	System.out.println("===========MultiTon===========");
        if (!obj.containsKey(key)) {
        	ta = new TeacherA();
        	obj.put(key, ta);
        	System.out.println("Teacher A with key: "+key+" is created, "+ta);
        	return ta;
        }
        System.out.println("already exist");
        return null;
    }
}

