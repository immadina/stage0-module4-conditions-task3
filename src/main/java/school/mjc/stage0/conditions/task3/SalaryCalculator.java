package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        /*
         * Basic Salary <= 10000: taxes - 15%.
         * 10000 < Basic Salary <= 20000: taxes - 18%
         * Basic Salary > 20000 : taxes - 20%
         * Basic salary < 0 -> "wrong input!"*/
        double salaryAfterTax;
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            salaryAfterTax = salary - salary * 15 / 100;
            System.out.println(salaryAfterTax);
        } else if (10000 < salary && salary <= 20000) {
            salaryAfterTax = salary - salary * 18 / 100;
            System.out.println(salaryAfterTax);
        } else if (salary > 20000) {
            salaryAfterTax = salary - salary * 20 / 100;
            System.out.println(salaryAfterTax);
        }
    }
}
