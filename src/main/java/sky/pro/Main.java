package sky.pro;

public class Main {
    static Employee[] company = new Employee[10];

    public static void main(String[] args) {
        myMethod();
        printAllEmployees();
        System.out.println("Все зарплаты составляют " + calculateAllSalaries());
        System.out.println("Минимальная зарплата у работника " + findMinSalaryEmployee());
        System.out.println("Максимальная зарплата у работника " + findMaxSalaryEmployee());
        System.out.println("Средняя зарплата составляет  " + findAverageSalary());
    }

    static void myMethod() {


    }

    public static void printAllEmployees() {
        for (int i = 0; i < company.length; i++) {
            Employee employee = company[i];
                        System.out.println(company[i]);
        }
    }

    public static int calculateAllSalaries() {
        int sum = 0;
        for (int i = 0; i < company.length; i++) {
            sum = sum + company[i].getSalary();
        }
        return sum;
    }

    public static Employee findMinSalaryEmployee() {
        int min = Integer.MAX_VALUE;
        Employee poorest = null;
        for (int i = 0; i < company.length; i++) {
            if (company[i].getSalary() < min) {
                min = company[i].getSalary();
                poorest = company[i];
            }
        }
        return poorest;
    }

    public static Employee findMaxSalaryEmployee() {
        int max = Integer.MIN_VALUE;
        Employee richest = null;
        for (int i = 0; i < company.length; i++) {
            if (company[i].getSalary() > max) {
                max = company[i].getSalary();
                richest = company[i];
            }
        }
        return richest;
    }

    public static int findAverageSalary() {
        return calculateAllSalaries() / company.length;
    }
}
