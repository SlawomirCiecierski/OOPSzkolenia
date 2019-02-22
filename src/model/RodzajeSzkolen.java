package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RodzajeSzkolen {

    private String name_of_course;

    public RodzajeSzkolen(String name_of_course) {
        this.name_of_course = name_of_course;
    }

    public String getName_of_course() {
        return name_of_course;
    }

    public void setName_of_course(String name_of_course) {
        this.name_of_course = name_of_course;
    }

    @Override
    public String toString() {
        return "\nTYTUŁ" +
                "\n'" + name_of_course + '\'' +
                '\n';
    }
}
