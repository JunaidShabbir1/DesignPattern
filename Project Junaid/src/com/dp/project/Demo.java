package com.dp.project;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 	//TeacherA.GetTeacherA(0);
    	//TeacherB.GetTeacherB(0);
    	//TeacherC.GetTeacherC(0);
		
    	TeacherA t = TeacherA.GetTeacherA(0);
    	iDepartment d = t.getOutline("cs");
    	TeacherB ta = TeacherB.GetTeacherB(1);
    	d=t.getOutline("mechanics");
    	System.out.println(d.getCourseOutline());
    	
    	
	}

}
