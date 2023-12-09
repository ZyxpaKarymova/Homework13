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
        company[0] = new Employee(new Person("Ivan", "Ivanovich", "Ivanov"), "1", 20000);
        company[1] = new Employee(new Person("Petr", "Petrovich", "Petrov"), "2", 20010);
        company[2] = new Employee(new Person("Foma", "Bornovich", "Kinayev"), "3", 20000);
        company[3] = new Employee(new Person("Roman", "Ivanovich", "Ivanov"), "1", 20000);
        company[4] = new Employee(new Person("John", "Petrovich", "Petrov"), "2", 20000);
        company[5] = new Employee(new Person("Tom", "Borisovich", "Kinyazev"), "3", 20000);
        company[6] = new Employee(new Person("Oleg", "Ivanovich", "Tinkoff"), "1", 20000);
        company[7] = new Employee(new Person("Maxim", "Petrovich", "Petrov"), "2", 20000);
        company[8] = new Employee(new Person("Gerasim", "Fyodorovich", "Mumuov"), "3", 20000);
        company[9] = new Employee(new Person("Emmanuel", "Sidorovich", "Kant"), "3", 19990);

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
