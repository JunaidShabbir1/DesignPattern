package com.dp.project;

public class PAFKIET {

	public iDepartment getOutline(String dept) {
        if (dept.equalsIgnoreCase("cs")) {
            return new CS();
        } else {
            return new Null();
        }
    }
}
