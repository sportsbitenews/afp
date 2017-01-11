package com.levelup.domain;

import java.util.List;

/**
 * Created by jarsen on 12/28/16.
 */
public class Employee {

    private Integer empId;
    private String empName;
    private Integer agencyId;

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    private List<Policy> policies;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", agencyId=" + agencyId +
                ", policies=" + policies +
                '}';
    }
}
