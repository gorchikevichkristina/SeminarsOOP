package SeminarsOOP.StudentApp.Services;

import SeminarsOOP.StudentApp.Domen.Employee;
import SeminarsOOP.StudentApp.Domen.PersonComparator;
import SeminarsOOP.StudentApp.Domen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServices implements iPersonServices<Student> {
    private int count;
    private List<Student> students;

    public StudentServices() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        PersonComparator<Student> persComp = new PersonComparator<>();
        students.sort(persComp);
    }


    @Override
    public void create(String name, int age) {
        Student stud = new Student(name, age);
        count++;
        students.add(stud);
    }
}
