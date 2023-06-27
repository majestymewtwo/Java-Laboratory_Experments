//2
abstract class Department {
    double salary;
    double bonus;
    double totalSalary;

    Department(double sal) {
        this.salary = sal;
    }

    public abstract void callBonus();

    public void displayTotalSalary(String dept) {
        System.out.printf("%-20s%12.2f%12.2f%12.2f\n", dept, salary, bonus, totalSalary);
    }
}

class Accounts extends Department {
    Accounts(double sal) {
        super(sal);
        callBonus();
    }

    @Override
    public void callBonus() {
        this.bonus = 0.20 * this.salary;
        this.totalSalary = this.salary + this.bonus;
    }
}

class Sales extends Department {
    Sales(double sal) {
        super(sal);
        callBonus();
    }

    @Override
    public void callBonus() {
        this.bonus = 0.25 * this.salary;
        this.totalSalary = this.salary + this.bonus;
    }
}

class HR extends Department {
    HR(double sal) {
        super(sal);
        callBonus();
    }

    @Override
    public void callBonus() {
        this.bonus = 0.50 * this.salary;
        this.totalSalary = this.salary + this.bonus;
    }
}

public class MethodOverload {
    public static void main(String[] args) {
        Accounts accounts = new Accounts(10000);
        Sales sales = new Sales(10000);
        HR hr = new HR(10000);
        System.out.printf("%-20s%12s%12s%12s\n", "Department", "Salary", "Bonus", "Total Salary");
        accounts.displayTotalSalary("Account Department");
        sales.displayTotalSalary("Sales Department");
        hr.displayTotalSalary("HR Executive");
    }
}
