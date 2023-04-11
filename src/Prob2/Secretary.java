package Prob2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
    double overTimeHours;

    Secretary(String fName, String lName, double salary, LocalDate hiredate, double overTimeHours) {
        super(fName, lName, salary, hiredate);
        this.overTimeHours = overTimeHours;
    }

    public double getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    @Override
    public double computeSalary() {
        return salary + overTimeHours * 12;
    }
}
