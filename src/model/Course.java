package model;

import java.time.LocalDate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name_of_course, kategory;

    private String term_of_course;
    private String trener;

    public Course(String name_of_course, String kategory, String term_of_course, String trener) {

        this.name_of_course = name_of_course;
        this.kategory = kategory;

        this.term_of_course = term_of_course;
        this.trener = trener;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name_of_course='" + name_of_course + '\'' +
                ", kategory='" + kategory + '\'' +
                ", term_of_course=" + term_of_course +
                ", trener='" + trener + '\'' +
                '}';
    }

    public String getName_of_course() {
        return name_of_course;
    }

    public void setName_of_course(String name_of_course) {
        this.name_of_course = name_of_course;
    }

    public String getKategory() {
        return kategory;
    }

    public void setKategory(String kategory) {
        this.kategory = kategory;
    }


    public String getTerm_of_course() {
        return term_of_course;
    }

    public void setTerm_of_course(String term_of_course) {
        this.term_of_course = term_of_course;
    }

    public String getTrener() {
        return trener;
    }

    public void setTrener(String trener) {
        this.trener = trener;
    }
}
