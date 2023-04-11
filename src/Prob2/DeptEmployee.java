package Prob2;

import java.time.LocalDate;

public class DeptEmployee {
    String fName;
    String lName;
    LocalDate hiredate;
    double salary;

    DeptEmployee(String fName, String lName, double salary,LocalDate hiredate) {
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        this.hiredate = hiredate;

    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public LocalDate getHiredate() {
        return hiredate;
    }

    public void setHiredate(LocalDate hiredate) {
        this.hiredate = hiredate;
    }
    public double computeSalary(){
        return salary;
    }
}
