package Prob2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeptEmployee[] department = {
                new Professor("Paul", "Smith", 50000, LocalDate.of(2012, 10, 15), 5),
                new Professor("David", "Williams", 60000, LocalDate.of(2015, 9, 3), 4),
                new Professor("Jones", "Anderson", 90000, LocalDate.of(1990, 3, 28), 10),
                new Secretary("Mary", "Harper", 35000, LocalDate.of(2016, 5, 12), 1200),
                new Secretary("Bob", "Brown", 45000, LocalDate.of(2010, 6, 30), 1800)};

        Scanner sc = new Scanner(System.in);
        System.out.println("List of all department employee: Y/N");
        String ans = sc.nextLine();
        if (ans.equals("Y") || ans.equals("y")) {
            for (DeptEmployee e : department) {
                System.out.println(" Name: " + e.fName + " " + e.lName + " [Annual salary: " + e.computeSalary() + "]");
            }
        }
    }
}
