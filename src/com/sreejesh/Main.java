package com.sreejesh;

import com.sreejesh.company.Company;
import com.sreejesh.employee.Employee;

public class Main {

    public static void main(String[] args) {

        Company myCompany = new Company();
        myCompany.setEmployee(new Employee());
        myCompany.setName("ABC Corp.");

        System.out.println("myCompany: "+myCompany);

    }
}
