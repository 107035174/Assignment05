package Prob4;

final class BasePlusCommissionEmployee extends CommissionEmployee {
    final double baseSalary;

    BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    double getPayment() {
        return baseSalary + (grossSales * commissionRate);
    }

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + " SSN: " + socialSecurityNumber + " [Commission payment: $" + getPayment() + " || Base salary: $" + baseSalary + "]";
    }
}
