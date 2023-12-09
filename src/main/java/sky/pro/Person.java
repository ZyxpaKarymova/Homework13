package sky.pro;

public class Person {
    String name;

    String middleName;

    String surname;

    public Person(String name, String middleName,String surname) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName=middleName;
    }

    public void setSurname() {
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {

        return "Имя " + this.name + ", Отчество " + this.middleName + ", Фамилия " + this.surname;
    }
}
