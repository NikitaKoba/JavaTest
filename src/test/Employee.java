package test;

public class Employee {
    int id;
    String surname;
    int age;
    int salary;
    String departament;

    int incrSalary(){
        salary = salary + salary;
        return salary;
    }

    void showInfo() {
        System.out.println("Табельный номер сотрудника: " + id + "\n" + " Фамилия:  " + surname + "\n" + "Возраст: " + age + "\n" + "Зарплата "  + salary);
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee oneSoul = new Employee();
        Employee twoSoul = new Employee();
        oneSoul.id = 13113;
        oneSoul.surname = "Петрович";
        oneSoul.age = 58;
        oneSoul.salary = 45000;
        oneSoul.incrSalary();
        oneSoul.showInfo();
    }


}