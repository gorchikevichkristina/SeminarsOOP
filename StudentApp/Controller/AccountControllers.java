package SeminarsOOP.StudentApp.Controller;

public class AccountControllers {
    public <T> void paySalary(T person, int salary) {
        System.out.println(person.getName() + "выплачено зарплата 10000р");
    }
}
