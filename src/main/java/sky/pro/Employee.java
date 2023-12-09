package sky.pro;

public class Employee {
    public static int ID;
    private Person person;
    private String department;
    private int salary;
    private int id;

    public Employee(Person person, String department, int salary) {
        this.person = person;
        this.department = department;
        this.salary = salary;
        this.id = ID;
        ID++;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return this.person;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getiD() {
         return id;
    }

    public String toString() {
        return "ID:" + this.id + ", ФИО: " + this.person + ", Отдел: " + this.department + ", Зарплата: " + this.salary;
    }

}
