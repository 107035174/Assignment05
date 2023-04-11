package Prob4;

class CommissionEmployee extends Employee {
    final double grossSales;
    final double commissionRate;

    CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    double getPayment() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + " SSN: " + socialSecurityNumber + " [Commission payment: $" + getPayment() + "]";
    }
}
