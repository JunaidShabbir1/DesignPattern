package com.dp.project;

import java.util.HashMap;

public class TeacherB extends PAFKIET{
    static TeacherA obj1;
    static TeacherB ta;
    static TeacherC obj2;
    
    static  HashMap<Integer, TeacherB> obj = new HashMap<Integer, TeacherB>();
    private TeacherB()
    {

    }
    public static TeacherB GetTeacherB(int key) {
    	System.out.println("===========MultiTon===========");
        if (!obj.containsKey(key)) {
        	ta = new TeacherB();
        	obj.put(key, ta);
        	System.out.println("Teacher A with key: "+key+" is created, "+ta);
        	return ta;
        }
        System.out.println("already exist");
        return null;
    }
}
