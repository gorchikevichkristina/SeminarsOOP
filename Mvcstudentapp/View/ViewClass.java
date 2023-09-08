package SeminarsOOP.Mvcstudentapp.View;

import SeminarsOOP.Mvcstudentapp.Model.Core.Student;

import java.util.List;

public class ViewClass {
    public void printAllStudent(List<Student> students);{
        System.out.println("-----------Список студентов --------");
        for (Student s : students){
            System.out.println(s);
        }
        System.out.println("-----------------");
    }

}
