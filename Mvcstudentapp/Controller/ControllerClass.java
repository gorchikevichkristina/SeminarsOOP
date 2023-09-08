package SeminarsOOP.Mvcstudentapp.Controller;

import SeminarsOOP.Mvcstudentapp.Model.ModelClassList;
import SeminarsOOP.Mvcstudentapp.View.ViewClass;

public class ControllerClass {
    private ModelClassList model;
    private ViewClass view;

    public ControllerClass(ModelClassList model, ViewClass view) {
        this.model = model;
        this.view = view;
    }

    public void update(){
        //MVC
        view.printAllStudent(model.getStudents());
    }
}
