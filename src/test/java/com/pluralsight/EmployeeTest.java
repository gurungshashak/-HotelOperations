package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee emp = new Employee(14,"Shashak","Software",25);

    @Test
    void punchIn() {
        //punch in and out
       emp.punchIn(9.0);
       emp.punchOut(17.0);

       double totalhr = 17.0 - 9.0;

       assertEquals(totalhr, emp.getHourWorked());
    }

}