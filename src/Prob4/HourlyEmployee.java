package Prob4;

final class HourlyEmployee extends Employee {
    final double wage;
    final double hours;

    HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    double getPayment() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + " SSN: " + socialSecurityNumber + " [Hourly payment: $" + getPayment() + "]";
    }
}
