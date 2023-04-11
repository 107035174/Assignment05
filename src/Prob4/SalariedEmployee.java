package Prob4;

final class SalariedEmployee extends Employee {
    final double weeklySalary;

    SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    double getPayment() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + " SSN: " + socialSecurityNumber + " [Weekly salary: $" + getPayment() + "]";
    }
}
