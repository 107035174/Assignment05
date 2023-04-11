package Prob2;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
    int numberOfPublications;

    Professor(String fName, String lName, double salary, LocalDate hiredate, int numberOfPublications) {
        super(fName, lName, salary, hiredate);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
