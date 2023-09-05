package SeminarsOOP.StudentApp.Controller;

import SeminarsOOP.StudentApp.Domen.Teacher;

public class AccountControllers {
    public <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + "выплачено зарплата 10000р");
    }
}
