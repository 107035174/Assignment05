package Prob4;

abstract class Employee {
    String firstName;
    String lastName;
    String socialSecurityNumber;

    Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    abstract double getPayment();
}
