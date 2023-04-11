package Prob4;

public class Driver {
    public static void main(String[] args) {
        Employee[] emps = {
                new CommissionEmployee("Paul", "Smith", "872184826", 5000, 0.2),
                new BasePlusCommissionEmployee("David", "Williams", "620132770", 4000, 0.15, 500),
                new HourlyEmployee("Jones", "Anderson", "986684946", 15, 40),
                new SalariedEmployee("Mary", "Harper", "770442156", 1200),
                new BasePlusCommissionEmployee("Bob", "Brown", "765390288", 6000, 0.18, 300)};

        for (Employee e : emps) {
            System.out.println(e);
        }
        System.out.println("Total payment to all employees: $" + totalPayment(emps));
    }

    static int totalPayment(Employee[] e) {
        int sum = 0;
        for (Employee o : e) {
            sum += o.getPayment();
        }
        return sum;
    }
}
