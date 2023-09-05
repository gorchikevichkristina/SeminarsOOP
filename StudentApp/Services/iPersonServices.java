package SeminarsOOP.StudentApp.Services;

import java.util.List;

public interface iPersonServices<T> {
    List<T> getAll();

    void create(String name, int age);
}
