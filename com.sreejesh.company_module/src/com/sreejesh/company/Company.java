package com.sreejesh.company;

import com.sreejesh.employee.Employee;

public class Company {

    private String name;

    private Employee employee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employee=" + employee +
                '}';
    }
}
